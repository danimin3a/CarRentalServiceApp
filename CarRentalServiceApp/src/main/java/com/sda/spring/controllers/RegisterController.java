package com.sda.spring.controllers;

import com.sda.spring.entities.AuthoritiesEntity;
import com.sda.spring.entities.UserEntity;
import com.sda.spring.models.UserModel;
import com.sda.spring.repositories.AuthorityRepository;
import com.sda.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authoritiesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        ModelAndView modelAndView = new ModelAndView("main_page/register");
        modelAndView.addObject("user", new UserModel());
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView saveUser(@ModelAttribute("user") UserModel userModel) {
        ModelAndView modelAndView = new ModelAndView("redirect:/register");
        UserEntity userEntity = null;
        if (userModel.getUserId() != null) {
            userEntity = userRepository.findById(userModel.getUserId()).get();
        } else {
            userEntity = new UserEntity();
        }
        userEntity.setUsername(userModel.getUsername());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPassword(passwordEncoder.encode(userModel.getPassword()));
        userEntity.setEnabled(true);

        //set authorities value
        AuthoritiesEntity authoritiesEntity;
        if (userModel.getUserId() != null) {
            authoritiesEntity = authoritiesRepository.findById(userModel.getUserId()).get();
        } else {
            authoritiesEntity = new AuthoritiesEntity();
        }
// Set authority fields
        authoritiesEntity.setUsername(userModel.getUsername());
        authoritiesEntity.setUser(userEntity);
        authoritiesEntity.setAuthority("USER");


        userRepository.save(userEntity);

        // Save authority
        authoritiesRepository.save(authoritiesEntity);

        return modelAndView;
    }
}