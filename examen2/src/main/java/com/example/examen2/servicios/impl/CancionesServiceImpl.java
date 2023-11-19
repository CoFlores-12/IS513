package com.example.examen2.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Canciones;
import com.example.examen2.repositorios.ArtistaRepository;
import com.example.examen2.repositorios.CancionesRepository;
import com.example.examen2.servicios.CancionesService;

@Service
public class CancionesServiceImpl implements CancionesService {

    @Autowired
    private CancionesRepository cancionesRepository;
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Canciones> delArtista(int codigoArtista) {
        Artista artista = this.artistaRepository.findById(codigoArtista).get();
        return this.cancionesRepository.findByArtista(artista);
    }

    @Override
    public Canciones crear(Canciones cancion) {
        return this.cancionesRepository.save(cancion);
    }

    @Override
    public Boolean eliminar(int codigoCancion) {
        Canciones cancion = this.cancionesRepository.findById(codigoCancion).get();
        if (cancion != null) {
            this.cancionesRepository.delete(cancion);
            return true;
        }
        return false;
    }

    @Override
    public Artista asociar(int codigoArtista, int codigoCancion) {
        Canciones cancion = this.cancionesRepository.findById(codigoCancion).get();
        Artista artista = this.artistaRepository.findById(codigoArtista).get();
        if (cancion != null) {
            if (artista != null) {
                cancion.setArtista(artista);
                this.cancionesRepository.save(cancion);
            }
        }
        return artista;
    }

    @Override
    public List<Artista> porNombre(String nombre) {
        List<Canciones> canciones =  this.cancionesRepository.findByTitulo(nombre);
        List<Artista> artistas = new ArrayList<>();
        for (Canciones cancion : canciones) {
            artistas.add(cancion.getArtista());
        }
        return artistas;

    }
    
}
