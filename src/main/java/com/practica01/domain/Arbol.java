package com.practica01.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private long idArbol;

    private String nombreComun;
    private String nombreCientifico;
    private String region;
    private int altura;
    private String rutaImagen;
}
