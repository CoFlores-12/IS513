package hn.unah.ejercicio1.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.ejercicio1.modelos.Usuarios;
import hn.unah.ejercicio1.servicios.impl.PerfilesServiceImpl;
import hn.unah.ejercicio1.servicios.impl.UsuariosServiceImpl;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosServiceImpl usuariosServiceImpl;
    @Autowired
    private PerfilesServiceImpl perfilesServiceImpl;
    
    @PostMapping("/crear")
    public Usuarios newUser(@RequestBody Usuarios nuevoUsuario){
        Integer idPerfil = nuevoUsuario.getPerfil().getIdperfil();
        if (this.perfilesServiceImpl.exist(idPerfil)) {
            nuevoUsuario.setPerfil(this.perfilesServiceImpl.obtenerPorId(idPerfil));
        }
        return this.usuariosServiceImpl.crearUsuario(nuevoUsuario);
    }

    @GetMapping("/obtener/{codigo}")
    public Usuarios getUsuario(@PathVariable String codigo){
        return this.usuariosServiceImpl.obtenerPorCodigo(codigo);
    }

    @GetMapping("/obtener")
    public List<Usuarios> getUsuarios(){
        return this.usuariosServiceImpl.obtenerTodosUsuarios();
    }

    @DeleteMapping("/eliminar/{codigo}")
    public String deleteEliminar(@PathVariable String codigo){
        Usuarios usuario = this.usuariosServiceImpl.obtenerPorCodigo(codigo);
        if (usuario != null) {
            this.usuariosServiceImpl.eliminarUsuarios(codigo);
            return "eliminado";
        }
        return "Usuario no encontrado";
    }
}
