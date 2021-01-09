package com.sda.spring.controllers;

import com.sda.spring.models.CarsModel;
import com.sda.spring.repositories.CarsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CarsController {
    private static final Logger logger = LoggerFactory.getLogger(CarsController.class);
    @Autowired
    private CarsRepository carsRepository;


    public CarsController() {
        logger.info(getClass().getSimpleName() + " created");
    }

//    @GetMapping("/cars")
//    public ModelAndView getCarsPage() {
//        ModelAndView modelAndView = new ModelAndView("cars");
//        modelAndView.addObject("carsList", carsRepository.findAll());
//        return modelAndView;
//    }

    @GetMapping("/cars/add")
    public ModelAndView addNewCar() {
        ModelAndView modelAndView = new ModelAndView("cars-form");
        modelAndView.addObject("car", new CarsModel());

        return modelAndView;
    }

    //    @GetMapping("cars/edit/{id}") {
//
//    }
//
//    @PostMapping("cars/save") {
//
//    }
//
//    @GetMapping("cars/delete/{id}") {
//}
    @GetMapping("/cars")
    public ModelAndView sportcars() {
        ModelAndView modelAndView = new ModelAndView("secondary_pages/cars/cars");
        return modelAndView;
    }
}

