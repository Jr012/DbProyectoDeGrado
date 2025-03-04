package com.example.DbProyectoDeGrado.auth.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoSingUpRequest {

    String username;
    String password;
    String firtsname;
    String lastname;
    String contry;

}
