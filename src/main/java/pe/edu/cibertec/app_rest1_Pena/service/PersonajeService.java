package pe.edu.cibertec.app_rest1_Pena.service;

import pe.edu.cibertec.app_rest1_Pena.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeService {

    List<Personaje> findAll();
    Optional<Personaje> findById(long id);
}
