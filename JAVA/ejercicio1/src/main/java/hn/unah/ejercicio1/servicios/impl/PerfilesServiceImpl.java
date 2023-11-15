package hn.unah.ejercicio1.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.ejercicio1.modelos.Perfiles;
import hn.unah.ejercicio1.repositorios.PerfilesRepository;
import hn.unah.ejercicio1.servicios.PerfilesService;

@Service
public class PerfilesServiceImpl implements PerfilesService {

    @Autowired
    private PerfilesRepository perfilesRepository;

    @Override
    public Perfiles crear(Perfiles perfil) {
        return this.perfilesRepository.save(perfil);
    }

    @Override
    public Perfiles obtenerPorId(Integer id) {
        Perfiles perfil = this.perfilesRepository.findById(id).get();
        return perfil;
    }

    @Override
    public Boolean exist(Integer idPerfil) {
       return this.perfilesRepository.existsById(idPerfil);
    }
}
