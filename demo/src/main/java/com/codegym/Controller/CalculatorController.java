package com.codegym.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @RequestMapping(value = "/calculator")
    public ModelAndView Index() {
        ModelAndView mv = new ModelAndView("Calculator/calculatorInput");
        return mv;
    }

    @PostMapping(value = "/calculation-result")
    public ModelAndView Result(@RequestParam double input1,@RequestParam double input2, @RequestParam String calculation) {
        ModelAndView mv = new ModelAndView("Calculator/calculatorResult");
        double result = 0;
        switch (calculation) {
            case "Addition(+)":
                result = input1 + input2;
                break;
            case "Suptraction(-)":
                result = input1 - input2;
                break;
            case "Multiplication(*)":
                result = input1 * input2;
                break;
            case "Division(/)":
                result = input1 / input2;
                break;
        }
        mv.addObject("result", result);

        return mv;
    }

}
