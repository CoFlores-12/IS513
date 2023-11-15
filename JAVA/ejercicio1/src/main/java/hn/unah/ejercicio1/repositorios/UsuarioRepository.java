package hn.unah.ejercicio1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.ejercicio1.modelos.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {
}
