package com.example.examen2.modelos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "artista")
public class Artista {
    @Id
    @Column(name = "codigoartista")
    private int codigoartista;

    @Column(name = "nombreartistico")
    private String nombreartistico;

    private String nombre;
    private String apellido;

    @Column(name = "fechanacimiento")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechanacimiento;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private List<Canciones> canciones;

    @OneToOne
    @JoinColumn(name = "codigocontacto")
    private Contacto contacto;
}
