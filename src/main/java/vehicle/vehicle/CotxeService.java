package vehicle.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vehicle.persona.Persona;
import vehicle.persona.PersonaRepository;

import java.util.List;

/**
 * Created by professor on 11/07/2016.
 */
@Service
public class CotxeService {
    @Autowired
    private CotxeRepository cotxeRepository;
    @Autowired
    private PersonaRepository personaRepository;
    public void testCotxes(){
        Cotxe c1 = new Cotxe();
        c1.setMarca("Seat");
        c1.setModelo("Leon");
        c1.setAñoFab(2016);
        c1.setPrecio(30000);
        c1.setMatricula("2134BBB");

        Persona p1 = new Persona();
        p1.setNombre("Roman");
        personaRepository.save(p1);
        c1.setPropietario(p1);
        cotxeRepository.save(c1);

        Cotxe c2 = new Cotxe();
        c2.setMarca("Peugeot");
        c2.setModelo("208");
        c2.setAñoFab(2008);
        c2.setPrecio(15000);
        c2.setMatricula("1234AAA");
        Persona p2 = personaRepository.findOne(1L);
        c2.setPropietario(p2);
        cotxeRepository.save(c2);



        Cotxe c3 = new Cotxe();
        c3.setMarca("Nissan");
        c3.setModelo("Lancer");
        c3.setAñoFab(2004);
        c3.setPrecio(300000);
        c3.setMatricula("4321CCC");
        Persona p3 = personaRepository.findOne(1L);
        c3.setPropietario(p3);
        cotxeRepository.save(c3);
        Cotxe c4 = new Cotxe();
        c4.setMarca("Seat");
        c4.setModelo("Toledo");
        c4.setAñoFab(2008);
        c4.setPrecio(50000);
        c4.setMatricula("1234BBB");
        Persona p4 = personaRepository.findOne(4L);
        c4.setPropietario(p4);
        cotxeRepository.save(c4);
        Cotxe c5 = new Cotxe();
        c5.setMarca("Subaru");
        c5.setModelo("Ipreza");
        c5.setAñoFab(2016);
        c5.setPrecio(80000);
        c5.setMatricula("9999ZZZ");
        Persona p5 = personaRepository.findOne(2L);
        c5.setPropietario(p5);
        cotxeRepository.save(c5);

        System.out.println("Cotxe que su fecha de fabricacion sea menor o igual a 2010");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByAñoFabLessThan(2010));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cotxe que su fecha de fabricacion sea entre 2005 a 2020");//<--- no funciona
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByAñoFabBetween(2005,2020));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cotxe que su fecha de fabricacion sea mayor o igual a 2010");//<--- no funciona
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByAñoFabGreaterThan(2010));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cotxe que su precio sea entre 25000 a 100000");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByPrecioBetween(25000,100000));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Que cotxe tiene la matricula 9999ZZZ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMatricula("9999ZZZ"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes de Peugeot");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMarca("Peugeot"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los Cotxes de la marca Seat i del modelo Toledo");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMarcaAndModelo("Seat","Toledo"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Precio medio de la marca Seat");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByCotxeArimeticaIs("Seat"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cotxe que  de la marca seat  y su precio sea menor a 30000");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMarcaAndPrecioLessThan("Seat",30001));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cotxe que  de la marca seat  y su precio sea menor a 30000");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMarcaAndModeloAndPrecioGreaterThan("Seat","Toledo",30000));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes de ivan");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByTotalCotxeIs("Ivan"));
        System.out.println("Todos los cotxes de ivan y su precio es mayor 200000");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByTotalCotxeAndPrecioGreaterThan("Ivan",200000));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes de ivan y su precio es mayor 200000, y su rango de año de fabricacio es del 2000 al 2010 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByTotalCotxeAndPrecioGreaterThanAndRangaYear("Ivan",200000,2000,2010));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes que su propietario sea mayor de 15 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByTotalCotxeGreaterAge(15));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes que su propietario tenga entre 21 i 30 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByTotalCotxeRangeAge(21,30));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Todos los cotxes que su matricula contenga 21C ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMatriuclaIs("21C"));
        System.out.println("------------------------------------------------------------------");
        System.out.println(cotxeRepository.findByMatriculaContaining("21C"));
        System.out.println("------------------------------------------------------------------");

        System.out.println("Precio medio  i precio maximo i minimo ");
        System.out.println("------------------------------------------------------------------");

        System.out.println("java 8");
        cotxeRepository.findByCotxeArimeticaAndPrecioMaxIs().forEach(

                estadisticasMarca ->
                {
                    System.out.println("marca: " + estadisticasMarca[0]);
                    System.out.println("media: " + estadisticasMarca[1]);
                    System.out.println("max: " + estadisticasMarca[2]);
                    System.out.println("min: " + estadisticasMarca[3]);
                    System.out.println("------------------------------------------------------------------");
                }
        );



        System.out.println("------------------------------------------------------------------");
        System.out.println("java 5");

        List<Object[]> estadisticasMarcaList =cotxeRepository.findByCotxeArimeticaAndPrecioMaxIs();

        for (Object[] estadisticasMarca : estadisticasMarcaList) {
            System.out.println("marca: " + estadisticasMarca[0]);
            System.out.println("media: " + estadisticasMarca[1]);
            System.out.println("max: " + estadisticasMarca[2]);
            System.out.println("min: " + estadisticasMarca[3]);
            System.out.println("------------------------------------------------------------------");

        }
        System.out.println("------------------------------------------------------------------");


    }
}
