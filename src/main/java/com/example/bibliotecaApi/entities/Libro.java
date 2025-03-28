package com.example.bibliotecaApi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String categoria;
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
