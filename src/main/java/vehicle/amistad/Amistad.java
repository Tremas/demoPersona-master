package vehicle.amistad;

import vehicle.persona.Persona;

import javax.persistence.*;
import java.util.Comparator;

/**
 * Created by professor on 14/07/2016.
 */
@Entity
public class Amistad  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Persona p1;
    @OneToOne
    private Persona p2;

    public Amistad(Persona p1, Persona p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Amistad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getP1() {
        return p1;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    public Persona getP2() {
        return p2;
    }

    public void setP2(Persona p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Amistad{" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amistad amistad = (Amistad) o;

        if (!getP1().equals(amistad.getP1())) return false;
        return getP2().equals(amistad.getP2());

    }

    @Override
    public int hashCode() {
        int result = getP1().hashCode();
        result = 31 * result + getP2().hashCode();
        return result;
    }

    /* @Override
    public int compareTo(Persona persona) {

        return 0;
    }*/
}
