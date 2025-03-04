package com.example.DbProyectoDeGrado.auth.services;


import com.example.DbProyectoDeGrado.auth.dto.AuthResponse;
import com.example.DbProyectoDeGrado.auth.dto.DtoLoginRequest;
import com.example.DbProyectoDeGrado.auth.dto.DtoSingUpRequest;
import com.example.DbProyectoDeGrado.auth.entity.EntityRole;
import com.example.DbProyectoDeGrado.auth.entity.EntityUsuario;
import com.example.DbProyectoDeGrado.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServices {

    private final UserRepository userRepository;
    private final JwtServices jwtServices;

    public AuthResponse login(DtoLoginRequest request) {
        return null;
    }

    public AuthResponse singUp(DtoSingUpRequest request) {
        EntityUsuario usuario = EntityUsuario.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .firtsname(request.getFirtsname())
                .lastname(request.getLastname())
                .contry(request.getContry())
                .role(EntityRole.USER)
                .build();

        userRepository.save(usuario);

            return AuthResponse.builder()
                .token(jwtServices.getToken(usuario))
                .build();

    }
}
