package com.example.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen2.modelos.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
