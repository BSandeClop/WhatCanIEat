package net.whatcanieat.backend.plato;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.whatcanieat.backend.enums.Continente;
import net.whatcanieat.backend.enums.Sabor;
import net.whatcanieat.backend.enums.Temperatura;

/*
 * @Author Crio
 */

@Entity
public class Plato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String engName;
    private String ogName;
    private Temperatura temperatura;
    private Sabor sabor;
    private Continente continente;
    private String pais;


    protected Plato() {
    }


    public Plato(String engName, String ogName, Temperatura temperatura, Sabor sabor, Continente continente,
            String pais) {
        this.engName = engName;
        this.ogName = ogName;
        this.temperatura = temperatura;
        this.sabor = sabor;
        this.continente = continente;
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Plato [continente=" + continente + ", engName=" + engName + ", id=" + id + ", ogName=" + ogName
                + ", pais=" + pais + ", sabor=" + sabor + ", temperatura=" + temperatura + "]";
    }

        

}
