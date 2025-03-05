package com.example.DbProyectoDeGrado.Auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    public String username;
    public String password;
    public String firstname;
    public String lastname;
    public String country;
}
