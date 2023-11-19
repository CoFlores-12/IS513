package com.example.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "canciones")
public class Canciones {
    @Id
    @Column(name = "codigocancion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigocancion;

    private String titulo;
    private String album;
    private int aniolanzamiento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoartista", referencedColumnName = "codigoartista")
    private Artista artista;

}
