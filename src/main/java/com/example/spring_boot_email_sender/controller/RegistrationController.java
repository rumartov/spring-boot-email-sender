package com.example.spring_boot_email_sender.controller;

import com.example.spring_boot_email_sender.model.Role;
import com.example.spring_boot_email_sender.model.User;
import com.example.spring_boot_email_sender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(@AuthenticationPrincipal User user) {
        if(user != null){
            return "redirect:/";
        }

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user) {

        if(!userService.addUser(user)){
            return "registration";
        }

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(@AuthenticationPrincipal User user) {
        if(user != null){
            return "redirect:/";
        }

        return "login";
    }
}
