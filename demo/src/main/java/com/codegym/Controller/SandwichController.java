package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SandwichController {
    @RequestMapping(value = "/")
    public ModelAndView Index() {
        ModelAndView mv = new ModelAndView("Sandwich/sandwichIndex");
        return mv;
    }

    @GetMapping(value = "/save")
    public ModelAndView SaveData(@RequestParam String[] condiment) {
        ModelAndView mv = new ModelAndView("Sandwich/sandwichOrder");
        String[] condiments = condiment;
        mv.addObject("condiments", condiments);
        return mv;
    }
}
