package com.Desafios.Desafios.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Contactos")
@Getter
@Setter
public class ContactoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String apelido;
    @Column(unique = true)
    private String email;
    private String Telefone;

}
