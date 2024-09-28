package pe.edu.cibertec.app_rest1_Pena.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app_rest1_Pena.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
