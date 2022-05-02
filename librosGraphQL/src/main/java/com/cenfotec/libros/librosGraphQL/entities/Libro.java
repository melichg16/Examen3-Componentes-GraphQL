package com.cenfotec.libros.librosGraphQL.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "ISBN", nullable = false)
    private String ISBN;
    @Column(name = "estado")
    private String estado;

}
