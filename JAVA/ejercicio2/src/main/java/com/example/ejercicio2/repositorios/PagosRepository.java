package com.example.ejercicio2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio2.modelos.Pagos;

public interface PagosRepository extends JpaRepository<Pagos, Integer> {
    
}
