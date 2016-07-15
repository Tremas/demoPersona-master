package vehicle.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by professor on 11/07/2016.
 */
public interface CotxeRepository extends JpaRepository<Cotxe,Long> {

    List<Cotxe>findByAñoFabLessThan(int año);

    List<Cotxe>findByAñoFabBetween(int añoini,int añofin);

    List<Cotxe>findByAñoFabGreaterThan(int año);

    List<Cotxe>findByPrecioBetween(int precio_ini,int precio_fin);

    Cotxe findByMatricula(String matricula);

    List<Cotxe>findByMarca(String marca);

    List<Cotxe>findByMarcaAndModelo(String marca,String modelo);
    /*@Query("select j from Jugador j where j.equipo.nombre=:nombreEquipo")
    List<Jugador> findByNombreEquipo(@Param("nombreEquipo") String nombreEquipo);*/
    /*@Query("select avg(c) from Cotxe c group by c.marca")
    public Page<Cotxe> findByCotxeArimeticaIs(Pageable pageable);*/

    @Query("select avg(c.precio) from Cotxe c where c.marca=:marcaCotxe")
     double findByCotxeArimeticaIs(@Param("marcaCotxe") String marcaCotxe);
    //@Query("SELECT c.id,c.marca,c.añoFab,c.marca,c.modelo,c.matricula,c.precio,p.nombre FROM Cotxe c INNER JOIN persona p ON c.propietario_id=p.id WHERE p.nombre=:nombrePersona")

    @Query("SELECT c FROM Cotxe c WHERE c.propietario.nombre=:nombrePersona")
    List<Cotxe> findByTotalCotxeIs(@Param("nombrePersona") String nombrePersona);

    List<Cotxe>findByMarcaAndPrecioLessThan(String marca,int precio_menor_que);

    List<Cotxe>findByMarcaAndModeloAndPrecioGreaterThan(String marcaa,String modelo,int precio_mayor_que);

    @Query("SELECT c FROM Cotxe c WHERE c.propietario.nombre=:nombrePersona and c.precio>:precio")
    List<Cotxe> findByTotalCotxeAndPrecioGreaterThan(@Param("nombrePersona") String nombrePersona,@Param("precio") Integer precio);

    @Query("SELECT c FROM Cotxe c WHERE c.propietario.nombre=:nombrePersona and c.precio>:precio and c.añoFab<:añomax and c.añoFab>:añomin")
    List<Cotxe> findByTotalCotxeAndPrecioGreaterThanAndRangaYear(@Param("nombrePersona") String nombrePersona,@Param("precio") Integer precio,@Param("añomin") Integer añomin,@Param("añomax") Integer añomax);

    @Query("SELECT c FROM Cotxe c WHERE c.propietario.edad>:edad")
    List<Cotxe> findByTotalCotxeGreaterAge(@Param("edad") Integer edadmin);

    @Query("SELECT c FROM Cotxe c WHERE c.propietario.edad>:edadmin and c.propietario.edad<:edadmax")
    List<Cotxe> findByTotalCotxeRangeAge(@Param("edadmin") Integer edadmin,@Param("edadmax") Integer edadmax);

    @Query("select c from Cotxe c where c.matricula like (concat('%',:matricula,'%'))")
    List<Cotxe> findByMatriuclaIs(@Param("matricula") String matricula);

    List<Cotxe> findByMatriculaContaining(String matricula);

    @Query("select c.marca, avg(c.precio),max(c.precio),min(c.precio) from Cotxe c group by c.marca")
    List<Object[]> findByCotxeArimeticaAndPrecioMaxIs();

    //devuelva todos lo coche  deun propietario especifico i que tengan un precio superioo a x
   // = que arriba + un rango de años de fabricacion
    //todos los coches de las personas que tengan mas de x años
    //todos los coches de las personas  que tebgo entre x e Y años
    //todos los coches cuya matricula tenga un String// listado de coches  matriula 1234abc si pones 1234 que salga

    //precio medio i el precio maximo de cada marca i el minimo,
}
