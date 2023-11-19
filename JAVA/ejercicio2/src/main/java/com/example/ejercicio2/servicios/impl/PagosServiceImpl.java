package com.example.ejercicio2.servicios.impl;

import java.sql.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.modelos.Empleado;
import com.example.ejercicio2.modelos.Pagos;
import com.example.ejercicio2.repositorios.EmpleadoRepository;
import com.example.ejercicio2.repositorios.PagosRepository;
import com.example.ejercicio2.servicios.PagosService;

@Service
public class PagosServiceImpl implements PagosService {

    @Autowired
    private PagosRepository pagosRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado create(Pagos pago, String dni) {
        Empleado empleado = this.empleadoRepository.findById(dni).get();
        if (empleado != null) {
            pago.setEmpleado(empleado);
            long millis=System.currentTimeMillis();
            pago.setFechaPago(new Date(millis));
            pago.setTotalSueldo((pago.getPrecioPorHora()*pago.getHorasTrabajadas()));
            this.pagosRepository.save(pago);
        }
        return empleado;
    }

    @Override
    public Empleado getPayments(Map<String, Object> params) {
        Empleado empleado = this.empleadoRepository.findById((String)params.get("idEmpleado")).get();
        return empleado;
    }
    
}
