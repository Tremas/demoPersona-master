package vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vehicle.domain.Pareja;
import vehicle.repository.ParejaRepository;
import vehicle.domain.Persona;
import vehicle.repository.PersonaRepository;

/**
 * Created by professor on 13/07/2016.
 */
@Service
@Transactional
public class ParejaService {
    @Autowired
    private ParejaRepository parejaRepository;
    @Autowired
    private PersonaRepository personaRepository;




    public void testPareja() {
        Persona p1=personaRepository.findOne(1L);
        Persona p2=personaRepository.findOne(2L);
        Persona p3=personaRepository.findOne(3L);
        addPareja(p1,p2);
        //addPareja(p1,p3);

       // System.out.println(pareja1);
        //System.out.println(pareja2);

    }

    private void addPareja(Persona p1,Persona p2){


        checkPareja(p1);
        checkPareja(p2);
        Pareja pareja = new Pareja(p1, p2);
        parejaRepository.save(pareja);

    }

    private void checkPareja(Persona p) {
        if(parejaRepository.findPareja(p)!=null) {

            throw new RuntimeException(p.getNombre()+" ya tiene pareja ");
        }
    }

    private Persona getPareja(Persona persona){

        Pareja pareja =parejaRepository.findPareja(persona);
        Persona resultado = null;
        if(pareja== null){
            return null;
        }else{
            if(pareja.getP1().equals(persona)){
                resultado=pareja.getP2();

            }else if (pareja.getP2().equals(persona)){

                resultado=pareja.getP1();
            }
            return resultado;
        }


    }
}
