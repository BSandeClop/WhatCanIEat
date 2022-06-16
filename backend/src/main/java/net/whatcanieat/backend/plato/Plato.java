package net.whatcanieat.backend.plato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import net.whatcanieat.backend.enums.Continente;
import net.whatcanieat.backend.enums.Sabor;
import net.whatcanieat.backend.enums.Temperatura;

@Entity(name = "Plato")
@Table(
    name = "plato",
    uniqueConstraints = {
        @UniqueConstraint(name="UQ_plato_og_name", columnNames = "og_name"),
        @UniqueConstraint(name="UQ_plato_eng_name", columnNames = "eng_name")
    }
)
public class Plato {

    @Id
    @SequenceGenerator(name = "plato_sequence", sequenceName = "plato_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plato_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "og_name", nullable = false)
    private String ogName;

    @Column(name = "eng_name", nullable = false)
    private String engName;

    @Enumerated(EnumType.STRING)
    @Column(name = "temperatura", nullable = false, columnDefinition = "ENUM('FRIO', 'CALIENTE')")
    private Temperatura temperatura;

    @Enumerated(EnumType.STRING)
    @Column(name = "sabor", nullable = false, columnDefinition = "ENUM('DULCE', 'AMARGO', 'SALADO', 'ACIDO', 'UMAMI')")
    private Sabor sabor;

    @Enumerated(EnumType.STRING)
    @Column(name = "continente", nullable = false, columnDefinition = "ENUM('AFRICA', 'AMERICA', 'ASIA', 'EUROPA', 'OCEANIA')")
    private Continente continente;

    @Column(name = "pais", nullable = false)
    private String pais;

    public Plato() {
    }

    public Plato(String ogName, String engName, Temperatura temperatura, Sabor sabor, Continente continente,
            String pais) {
        this.ogName = ogName;
        this.engName = engName;
        this.temperatura = temperatura;
        this.sabor = sabor;
        this.continente = continente;
        this.pais = pais;
    }

    public Plato(Long id, String ogName, String engName, Temperatura temperatura, Sabor sabor, Continente continente,
            String pais) {
        this.id = id;
        this.ogName = ogName;
        this.engName = engName;
        this.temperatura = temperatura;
        this.sabor = sabor;
        this.continente = continente;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOgName() {
        return ogName;
    }

    public void setOgName(String ogName) {
        this.ogName = ogName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Plato [continente=" + continente + ", engName=" + engName + ", id=" + id + ", ogName=" + ogName
                + ", pais=" + pais + ", sabor=" + sabor + ", temperatura=" + temperatura + "]";
    }

}
