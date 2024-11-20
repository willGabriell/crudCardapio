package com.crudcardapio.dto;

import com.crudcardapio.enums.UsuarioRoles;

public record RegisterDTO(String login, String password, UsuarioRoles role) {
}
