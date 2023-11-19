package com.example.ejercicio2.controladores;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio2.modelos.Empleado;
import com.example.ejercicio2.modelos.Pagos;
import com.example.ejercicio2.servicios.impl.EmpleadosServiceImpl;
import com.example.ejercicio2.servicios.impl.PagosServiceImpl;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosServiceImpl empleadosServiceImpl;

    @Autowired
    private PagosServiceImpl pagosServiceImpl;

    @PostMapping("/create")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return this.empleadosServiceImpl.create(empleado);
    }

    @DeleteMapping("/delete/{dni}")
    public Boolean deleteEmpleado(@PathVariable String dni){
        return this.empleadosServiceImpl.delete(dni);
    }

    @GetMapping("/search/{dni}")
    public Empleado searchEmpleado(@PathVariable String dni){
        return this.empleadosServiceImpl.get(dni);
    }

    @GetMapping("/search")
    public List<Empleado> searchEmpleadoAll(){
        return this.empleadosServiceImpl.getAll();
    }

    @PostMapping("/payments")
    public Empleado paymentsEmpleado(@RequestBody Map<String, Object> params){
        return this.pagosServiceImpl.getPayments(params);
    }

    @PostMapping("/pay/{dni}")
    public Empleado pay(@RequestBody Pagos pago, @PathVariable String dni){
        return this.pagosServiceImpl.create(pago, dni);
    }

}
