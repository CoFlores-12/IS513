package com.example.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen2.modelos.Contacto;
import com.example.examen2.repositorios.ContactoRepository;
import com.example.examen2.servicios.ContcatoService;

@Service
public class ContactoServiceImpl implements ContcatoService {

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public Contacto crear(Contacto contacto) {
        return this.contactoRepository.save(contacto);
    }
    
}
