package hn.unah.ejercicio1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.ejercicio1.modelos.Perfiles;
import hn.unah.ejercicio1.servicios.impl.PerfilesServiceImpl;

@RestController
@RequestMapping("/api/perfiles")
public class PerfilesController {
    
    @Autowired
    private PerfilesServiceImpl perfilesServiceImpl;

    @GetMapping("/obtener/{id}")
    public Perfiles getPerfiles(@PathVariable Integer id){
        return this.perfilesServiceImpl.obtenerPorId(id);
    }
}
