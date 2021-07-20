package com.example.spring_boot_email_sender.controller;

import com.example.spring_boot_email_sender.model.User;
import com.example.spring_boot_email_sender.service.MailService;
import com.example.spring_boot_email_sender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @Autowired
    private UserService userService;

    //@PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/mailer")
    public String mailer(@AuthenticationPrincipal User user) {
        return "mailer";
    }

    //@PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/mailer")
    public String sendMail(@AuthenticationPrincipal User user,
                           String subject,
                           String message) {

        List<User> users = userService.loadAllUsers();

        users.forEach(u -> mailService.send(u.getEmail(), subject, message));

        return "mailer";
    }
}
