package com.Wass.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @GetMapping("/register")
    public String hello() {
        return "Registered!";
    }
}
