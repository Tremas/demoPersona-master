package vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vehicle.domain.Amistad;
import vehicle.repository.AmistadRepository;
import vehicle.domain.Persona;
import vehicle.repository.PersonaRepository;

import java.util.List;

/**
 * Created by professor on 14/07/2016.
 */
@Service
public class AmistadService {
    @Autowired
    private AmistadRepository amistadRepository;
    @Autowired
    private PersonaRepository personaRepository;
    public void testAmistad() {
        Persona p1=personaRepository.findOne(1L);
        Persona p2=personaRepository.findOne(2L);

        addAmistad(p1,p2);
        addAmistad(p1,p2);

       // System.out.println(a);

    }
    public void addAmistad(Persona p1, Persona p2){
        Amistad amistad = new Amistad(p1, p2);
        List<Amistad> a= amistadRepository.findAmistad(p1);
        if(a.contains(amistad)){
            throw new RuntimeException("Estas 2 personas ya son amigos");
        }

        amistadRepository.save(amistad);

        //Amistad amistad = new Amistad(p1, p2);
        //amistadRepository.save(amistad);
    }
}
