package com.codegym.Controller;

import com.codegym.Model.Dictionary;
import com.codegym.Service.DictionaryServiceIm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class DictionaryController {
    @Autowired
    DictionaryServiceIm dictionaryServiceIm;

    @RequestMapping(value = {"/dictionary"})
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView("Dictionary/dictionary");
        return modelAndView;
    }

    @PostMapping(value = {"/translate"})
    public ModelAndView translate(@RequestParam String keyword) {
        ModelAndView mv = new ModelAndView("Dictionary/translate");
        List<Dictionary> dictionaries = dictionaryServiceIm.getAlldictionary();
        String result = null;
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEnglish())) {
                result = dictionaries.get(i).getVietnam();
            }
        }
        mv.addObject("result", result );
        return mv;

    }
}
