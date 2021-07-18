package com.example.spring_boot_email_sender.controller;

import com.example.spring_boot_email_sender.model.User;
import com.example.spring_boot_email_sender.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/profile/{username}")
    public String getProfile(@PathVariable("username") String username,
                             Model model){

        User user = userRepo.findByUsername(username);
        Iterable<User> users = userRepo.findAll();

        model.addAttribute("user", user);
        model.addAttribute("users", users);
        return "profile";
    }
}
