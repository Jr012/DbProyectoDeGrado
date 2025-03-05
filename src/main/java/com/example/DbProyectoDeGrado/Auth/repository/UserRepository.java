package com.example.DbProyectoDeGrado.Auth.repository;

import com.example.DbProyectoDeGrado.Auth.Entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<EntityUser,Integer> {
    Optional<EntityUser> findByUsername(String username);
}
