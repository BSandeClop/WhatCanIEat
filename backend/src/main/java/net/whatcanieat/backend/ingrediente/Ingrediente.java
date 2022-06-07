package net.whatcanieat.backend.ingrediente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.whatcanieat.backend.enums.Sabor;
/*
 * @Author Crio
 */
@Entity
public class Ingrediente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String family;
    private String engName;
    private String ogName;
    private Sabor sabor;

    protected Ingrediente() {}

    public Ingrediente(String family, String engName, String ogName, Sabor sabor) {
        this.family = family;
        this.engName = engName;
        this.ogName = ogName;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Ingrediente [engName=" + engName + ", family=" + family + ", id=" + id + ", ogName=" + ogName
                + ", sabor=" + sabor + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getOgName() {
        return ogName;
    }

    public void setOgName(String ogName) {
        this.ogName = ogName;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }
    
    
}
