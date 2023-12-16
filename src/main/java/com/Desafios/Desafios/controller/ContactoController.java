package com.Desafios.Desafios.controller;

import com.Desafios.Desafios.Service.ContactoService;
import com.Desafios.Desafios.models.ContactoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ContactoModel contactoModel){
        return contactoService.create(contactoModel);
    }
    @GetMapping
    public Iterable<ContactoModel> listar(){
        return contactoService.listar();
    }

}
