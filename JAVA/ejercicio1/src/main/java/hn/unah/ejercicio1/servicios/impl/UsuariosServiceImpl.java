package hn.unah.ejercicio1.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.ejercicio1.modelos.Usuarios;
import hn.unah.ejercicio1.repositorios.UsuarioRepository;
import hn.unah.ejercicio1.servicios.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuarios crearUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuarios(String codigo) {
        usuarioRepository.deleteById(codigo);
    }

    @Override
    public Usuarios obtenerPorCodigo(String dni) {
        return usuarioRepository.findById(dni).get();
    }

    @Override
    public List<Usuarios> obtenerTodosUsuarios() {
        return usuarioRepository.findAll();
    }
    
}
