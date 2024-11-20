package com.crudcardapio.repository;

import com.crudcardapio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    UserDetails findByLogin(String login);
}
