package vehicle.vehicle;

import vehicle.persona.Persona;

import javax.persistence.*;

/**
 * Created by professor on 11/07/2016.
 */
@Entity
public class Cotxe {
    //atributos id,marca,modelo,año de fabicacion,precio,matricula

    //<= año determinado
    //rango de coxes año
    //>= año determinado
    //rango de precios
    //dada un amatricula de el coxe

    //todos los cotxes de una determinada marca
    //todos los cotxes de una marca i modelo
    //precio medio de todos los coches de una determinada marca(groupby)<----
    //media todas la smatrcas
    // coxes deuna determinada marca con uun precio menor  a
    //todos los coches de una marcam y modelo, con un precio = o superior
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;
    private int añoFab;
    private int precio;
    private String matricula;
    @ManyToOne
    private Persona propietario;

    public Cotxe(String marca, String modelo, int añoFab, int precio, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFab = añoFab;
        this.precio = precio;
        this.matricula = matricula;
    }

    public Cotxe(String marca, String modelo, int añoFab, int precio, String matricula, Persona propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFab = añoFab;
        this.precio = precio;
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public Cotxe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFab=" + añoFab +
                ", precio=" + precio +
                ", matricula='" + matricula + '\'' +
                ", propietario=" + propietario +
                '}';
    }
}
