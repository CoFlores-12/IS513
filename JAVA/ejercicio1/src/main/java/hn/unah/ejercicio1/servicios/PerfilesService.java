package hn.unah.ejercicio1.servicios;

import hn.unah.ejercicio1.modelos.Perfiles;

public interface PerfilesService{
    public Perfiles crear(Perfiles perfil);
    public Perfiles obtenerPorId(Integer id);
    public Boolean exist(Integer idPerfil);
}
