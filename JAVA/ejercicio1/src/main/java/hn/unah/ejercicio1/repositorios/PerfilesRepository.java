package hn.unah.ejercicio1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.ejercicio1.modelos.Perfiles;

public interface PerfilesRepository extends JpaRepository<Perfiles, Integer> {
    
}
