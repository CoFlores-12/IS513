package com.example.ejercicio2.modelos;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historicopagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpago;

    @Column(name = "fechapagos", nullable = false)
    @Temporal(TemporalType.DATE)
    @CreatedDate
    private Date fechaPago;

    @Column(name = "horastrabajadas")
    private Integer horasTrabajadas;

    @Column(name = "precioporhora")
    private Float precioPorHora;

    @Column(name = "totalsueldo")
    private Float totalSueldo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Empleado empleado;
    
}
