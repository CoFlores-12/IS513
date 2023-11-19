package com.example.examen2.servicios;

import java.util.List;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Contacto;

public interface ArtistaService {
    public Artista crear(Artista artista);
    public Boolean eliminar(int codigoArtista);
    public Artista ActualizarDireccion(Contacto contacto, int codigoArtista);
    public Artista buscar(int codigoArtista);
    public List<Artista> todos();

}
