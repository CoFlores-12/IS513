package com.example.examen2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Canciones;

public interface CancionesRepository extends JpaRepository<Canciones, Integer> {
    List<Canciones> findByArtista(Artista artista);
    List<Canciones> findByTitulo(String titulo);
}
