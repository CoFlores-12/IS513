package com.example.ejercicio2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio2.modelos.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
    
}
