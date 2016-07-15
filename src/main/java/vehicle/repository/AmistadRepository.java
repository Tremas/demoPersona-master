package vehicle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vehicle.domain.Amistad;
import vehicle.domain.Persona;

import java.util.List;

/**
 * Created by professor on 14/07/2016.
 */
public interface AmistadRepository  extends JpaRepository<Amistad,Long> {
    @Query("select amistad from Amistad amistad where p1 = :persona")
    List<Amistad> findAmistad(@Param("persona")Persona persona);
}
