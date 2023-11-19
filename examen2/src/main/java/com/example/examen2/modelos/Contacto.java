package com.example.examen2.modelos;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "informacioncontacto")
public class Contacto {
    @Id
    @Column(name = "codigocontacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigocontacto; 

    private String pais;
    
    private String ciudad;

    private String telefono;
    
    private String correo;
    
    @JsonIgnore
    @OneToOne(mappedBy = "contacto", cascade = CascadeType.ALL)
    private Artista artista;
}
