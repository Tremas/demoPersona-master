package vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicle.domain.Persona;

import java.util.List;

/**
 * Created by professor on 20/06/2016.
 */
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    List<Persona> findByNombre(String Nombre);

}
