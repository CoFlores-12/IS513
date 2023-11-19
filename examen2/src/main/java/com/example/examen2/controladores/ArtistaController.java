package com.example.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Contacto;
import com.example.examen2.servicios.impl.ArtistaServiceImpl;
import com.example.examen2.servicios.impl.ContactoServiceImpl;

@RestController
@RequestMapping("/api/artista")
public class ArtistaController {
    @Autowired
    private ArtistaServiceImpl artistaServiceImpl;
    @Autowired
    private ContactoServiceImpl contactoServiceImpl;

    @PostMapping("/crear")
    public Artista createArtista(@RequestBody Artista artista){
        Contacto contacto = artista.getContacto();
        Artista artista2 = null;
        if (artista.getContacto() != null) {
            this.contactoServiceImpl.crear(contacto);
            artista2 = this.artistaServiceImpl.crear(artista);
            contacto.setArtista(artista2);
        }
        return artista2;
    }

    @DeleteMapping("/eliminar/{codigoArtista}")
    public Boolean deleteArtista(@PathVariable int codigoArtista){
        return this.artistaServiceImpl.eliminar(codigoArtista);
    }

    @PostMapping("/actualizar/{codigoArtista}")
    public Artista actualizarArtista(@RequestBody Contacto contacto, @PathVariable int codigoArtista){
        return this.artistaServiceImpl.ActualizarDireccion(contacto, codigoArtista);
    }

    @GetMapping("/buscar/{codigoArtista}")
    public Artista buscarArtista(@PathVariable int codigoArtista){
        return this.artistaServiceImpl.buscar(codigoArtista);
    }

    @GetMapping("/todos")
    public List<Artista> todos(){
        return this.artistaServiceImpl.todos();
    }
        
}
