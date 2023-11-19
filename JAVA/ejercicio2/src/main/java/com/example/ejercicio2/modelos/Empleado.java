package com.example.ejercicio2.modelos;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="empleados")
public class Empleado {
    @Id
    @Column(name = "dni")
    private String dni;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso", nullable = false)
    @Temporal(TemporalType.DATE)
    @CreatedDate
    private Date fechaIngreso;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Pagos> pagos;
}
