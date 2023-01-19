package com.teaching.controller;

import com.teaching.model.PersonData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("PersonData", new PersonData());
        return "homepage";
    }

    @RequestMapping(value = "/redirectPage")
    public String redirectToAnotherPageWithParams(@Valid @ModelAttribute("PersonData") PersonData personData,
                                                  BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "homepage";
        }
        model.addAttribute("name", personData.getName());
        model.addAttribute("age", personData.getAge());
        return "secondpage";
    }
}
