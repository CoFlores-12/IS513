package com.example.examen2.servicios;

import java.util.List;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Canciones;

public interface CancionesService {
    public List<Canciones> delArtista(int codigoArtista);
    public Canciones crear(Canciones cancion);
    public Boolean eliminar(int codigoCancion);
    public Artista asociar(int codigoArtista, int codigoCancion);
    public List<Artista> porNombre(String nombre);
}
