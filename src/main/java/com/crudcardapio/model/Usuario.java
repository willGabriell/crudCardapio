package com.crudcardapio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *  Classe que representa o usuário da aplicação
 */

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    private String nome;
    private String email;
    private String senha;
}
