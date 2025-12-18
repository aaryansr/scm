package com.smartcm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Controller Invoked");
        model.addAttribute("name","SmartCM User");
        model.addAttribute("title","Home - SmartCM");
        model.addAttribute("gitrepo","https://github.com/aaryansr");
        return "home";
    }
    
}
