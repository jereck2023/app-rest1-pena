package pe.edu.cibertec.app_rest1_Pena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_rest1_Pena.model.Personaje;
import pe.edu.cibertec.app_rest1_Pena.service.PersonajeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personajeSP")
public class PersonajesController {

    @Autowired
    private PersonajeService personajeservice;

    @GetMapping
    public List<Personaje> findAll() {

        return personajeservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> findById(@PathVariable Long id) {

        return personajeservice.findById(id);
    }

}
