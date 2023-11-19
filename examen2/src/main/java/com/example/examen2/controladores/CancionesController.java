package com.example.examen2.controladores;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen2.modelos.Artista;
import com.example.examen2.modelos.Canciones;
import com.example.examen2.servicios.impl.CancionesServiceImpl;

@RestController
@RequestMapping("/api/canciones")
public class CancionesController {
    @Autowired
    private CancionesServiceImpl cancionesServiceImpl;

    @GetMapping("/delartista/{codigoArtista}")
    public List<Canciones> getCanciones(@PathVariable int codigoArtista){
        return this.cancionesServiceImpl.delArtista(codigoArtista);
    }

    @PostMapping("/crear")
    public Canciones crear(@RequestBody Canciones cancion){
        return this.cancionesServiceImpl.crear(cancion);
    }

    @DeleteMapping("/eliminar/{codigocancion}")
    public Boolean delete(@PathVariable int codigocancion) {
        return this.cancionesServiceImpl.eliminar(codigocancion);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Artista> getNombres(@PathVariable String nombre){
        return this.cancionesServiceImpl.porNombre(nombre);
    }

    @PostMapping("/asociar")
    public Artista asociar(@RequestBody Map<String, Integer> params){
        return this.cancionesServiceImpl.asociar(params.get("codigoArtista"), params.get("codigoCancion"));
    }

}
