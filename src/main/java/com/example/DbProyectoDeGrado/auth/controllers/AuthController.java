package com.example.DbProyectoDeGrado.auth.controllers;


import com.example.DbProyectoDeGrado.auth.dto.AuthResponse;
import com.example.DbProyectoDeGrado.auth.dto.DtoLoginRequest;
import com.example.DbProyectoDeGrado.auth.dto.DtoSingUpRequest;
import com.example.DbProyectoDeGrado.auth.services.AuthServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthServices authServices;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> Login(@RequestBody DtoLoginRequest request) {
    return  ResponseEntity.ok(authServices.login(request));
    }

    @PostMapping(value = "singUp")
    public ResponseEntity<AuthResponse> singUp(@RequestBody DtoSingUpRequest request) {
        return ResponseEntity.ok(authServices.singUp(request));
    }

}
