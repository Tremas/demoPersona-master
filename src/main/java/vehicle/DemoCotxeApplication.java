package vehicle;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vehicle.amistad.AmistadService;
import vehicle.pareja.ParejaService;
import vehicle.persona.PersonaService;

/**
 * Created by professor on 11/07/2016.
 */
@SpringBootApplication
public class DemoCotxeApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoCotxeApplication.class, args);

        /*PersonaService personaService=context.getBean(PersonaService.class);

        personaService.testPersonas();*/
        PersonaService personaService=context.getBean(PersonaService.class);
        personaService.testPersonas();
        ParejaService parejaService=context.getBean(ParejaService.class);
        parejaService.testPareja();
        AmistadService amistadService=context.getBean(AmistadService.class);
        amistadService.testAmistad();
        /*CotxeService cotxeService=context.getBean(CotxeService.class);

        cotxeService.testCotxes();*/


    }
}
