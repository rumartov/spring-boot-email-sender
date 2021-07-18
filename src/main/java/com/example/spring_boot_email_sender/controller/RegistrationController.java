package com.example.spring_boot_email_sender.controller;

import com.example.spring_boot_email_sender.model.User;
import com.example.spring_boot_email_sender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user) {

        if(!userService.addUser(user)){
            return "registration";
        }

        return "redirect:profile";
    }
}
