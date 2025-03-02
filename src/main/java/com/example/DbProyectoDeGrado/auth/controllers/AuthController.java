package com.example.DbProyectoDeGrado.auth.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    @PostMapping(value = "login")
    public String Login() {
        return "login";
    }

    @PostMapping(value = "singUp")
    public String singUp() {
        return "singUp";
    }

}
