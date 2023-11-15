package hn.unah.ejercicio1.servicios;

import java.util.List;
import hn.unah.ejercicio1.modelos.Usuarios;

public interface UsuariosService {

    public Usuarios crearUsuario(Usuarios usuario);
    public void eliminarUsuarios(String codigo);
    public Usuarios obtenerPorCodigo(String dni);
    public List<Usuarios> obtenerTodosUsuarios();
    
}
