package com.example;

import org.hibernate.service.spi.InjectService;
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
        Persona persona = new Persona();
        persona.setNombre("Ivan");
        personaRepository.save(persona);

        Persona persona2 = new Persona();
        persona2.setNombre("Dimple");
        personaRepository.save(persona2);

        Persona persona3 = new Persona();
        persona3.setNombre("Noelia");
        personaRepository.save(persona3);

        Persona persona4 = new Persona();
        persona4.setNombre("Jordi");
        personaRepository.save(persona4);

        Persona persona5 = new Persona();
        persona5.setNombre("Ricard");
        personaRepository.save(persona5);
        System.out.println(personaRepository.findOne(2L));
        System.out.println(personaRepository.findByNombre("Noelia"));



    }
}
