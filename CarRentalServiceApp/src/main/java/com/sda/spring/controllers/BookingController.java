package com.sda.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
    @GetMapping("/booking")
    public ModelAndView getBooking() {
        ModelAndView modelAndView = new ModelAndView("secondary_pages/booking/bookings");
        return modelAndView;
    }
}

