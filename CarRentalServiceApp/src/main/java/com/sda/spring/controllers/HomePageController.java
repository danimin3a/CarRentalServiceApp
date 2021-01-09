package com.sda.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @GetMapping("/")
    public ModelAndView getHomePage() {
        ModelAndView modelAndView = new ModelAndView("main_page/homepage");
        return modelAndView;
    }
    @GetMapping("/home")
    public ModelAndView getHomePageHome() {
        ModelAndView modelAndView = new ModelAndView("main_page/homepage");
        return modelAndView;
    }
}
