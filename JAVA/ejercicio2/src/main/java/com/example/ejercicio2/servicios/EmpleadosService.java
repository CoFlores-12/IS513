package com.example.ejercicio2.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ejercicio2.modelos.Empleado;

@Service
public interface EmpleadosService {
    public Empleado create(Empleado empleado);
    public Empleado get(String dni);
    public Boolean delete(String dni);
    public List<Empleado> getAll();
}
