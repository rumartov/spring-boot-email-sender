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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String main(){
        return "main";
    }
}
