package com.teaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "homepage";
    }

    @RequestMapping("/redirectPage")
    public String redirectToAnotherPageWithParams(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "secondpage";
    }
}
