package vehicle.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by professor on 20/06/2016.
 */
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void testPersonas(){
        addPerson("Ivan",22);

        addPerson("Dimple",21);

        addPerson("Noelia",14);

        addPerson("Jordi",25);

        addPerson("Ricard",45);
       /*System.out.println(personaRepository.findOne(2L));
        System.out.println(personaRepository.findByNombre("Noelia"));*/



    }

    private void addPerson(String nombre,int edad) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        personaRepository.save(persona);
    }
}
