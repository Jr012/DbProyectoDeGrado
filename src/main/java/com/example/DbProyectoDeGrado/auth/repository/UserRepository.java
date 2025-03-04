package com.example.DbProyectoDeGrado.auth.repository;

import com.example.DbProyectoDeGrado.auth.entity.EntityUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<EntityUsuario, Integer> {
    Optional<EntityUsuario> findByUsername(String username);
}
