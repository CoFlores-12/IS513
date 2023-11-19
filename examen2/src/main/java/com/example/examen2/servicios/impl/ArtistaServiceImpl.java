package com.example.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Contacto;
import com.example.examen2.repositorios.ArtistaRepository;
import com.example.examen2.repositorios.ContactoRepository;
import com.example.examen2.servicios.ArtistaService;

@Service
public class ArtistaServiceImpl implements ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;
    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public Artista crear(Artista artista) {
        return this.artistaRepository.save(artista);
    }

    @Override
    public Boolean eliminar(int codigoArtista) {
        Artista artista = this.artistaRepository.findById(codigoArtista).get();
        Contacto contcato = artista.getContacto();
        if (artista != null) {
            this.contactoRepository.delete(contcato);
            return true;
        }
        return false;
    }

    @Override
    public Artista ActualizarDireccion(Contacto contacto, int codigoArtista) {
        Artista artista = this.artistaRepository.findById(codigoArtista).get();
        Contacto contactoOld = artista.getContacto();

        contactoOld.setCiudad(contacto.getCiudad());
        contactoOld.setCiudad(contacto.getCiudad());
        contactoOld.setCorreo(contacto.getCorreo());
        contactoOld.setPais(contacto.getPais());
        contactoOld.setTelefono(contacto.getTelefono());

        this.contactoRepository.save(contactoOld);

        return artista;
    }

    @Override
    public Artista buscar(int codigoArtista) {
        return this.artistaRepository.findById(codigoArtista).get();
    }

    @Override
    public List<Artista> todos() {
        return this.artistaRepository.findAll();
    }
    
}
