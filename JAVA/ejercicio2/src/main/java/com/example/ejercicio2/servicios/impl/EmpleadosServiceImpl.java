package com.example.ejercicio2.servicios.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.modelos.Empleado;
import com.example.ejercicio2.repositorios.EmpleadoRepository;
import com.example.ejercicio2.servicios.EmpleadosService;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado create(Empleado empleado) {
        long millis=System.currentTimeMillis();  
        empleado.setFechaIngreso(new Date(millis));
        return this.empleadoRepository.save(empleado);
    }

    @Override
    public Empleado get(String dni) {
        return this.empleadoRepository.findById(dni).get();
    }

    @Override
    public List<Empleado> getAll() {
        return this.empleadoRepository.findAll();
    }

    @Override
    public Boolean delete(String dni) {
        Empleado empleado = this.empleadoRepository.findById(dni).get();
        if (empleado != null) {
            this.empleadoRepository.delete(empleado);
            return true;
        }
        return false;
    }
    
}
