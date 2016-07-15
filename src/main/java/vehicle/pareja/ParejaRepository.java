package vehicle.pareja;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vehicle.persona.Persona;

/**
 * Created by professor on 13/07/2016.
 */
public interface ParejaRepository extends JpaRepository<Pareja,Long> {
    @Query ("select pareja from Pareja pareja where p1 = :persona or p2 = :persona")
    Pareja findPareja(@Param("persona") Persona persona);


}
