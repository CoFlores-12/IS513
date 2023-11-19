package com.example.ejercicio2.servicios;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.ejercicio2.modelos.Empleado;
import com.example.ejercicio2.modelos.Pagos;

@Service
public interface PagosService {
    public Empleado create(Pagos pago, String dni);
    public Empleado getPayments(Map<String, Object> params);
}
