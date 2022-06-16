package net.whatcanieat.backend.ingrediente;

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

import net.whatcanieat.backend.enums.FamiliaAlimenticia;

@Entity(name = "ingrediente")
@Table(
    name = "ingrediente",
    uniqueConstraints = {
        @UniqueConstraint(name="UQ_ingrediente_eng_name", columnNames = "eng_name")
    }
)

public class Ingrediente {
    @Id
    @SequenceGenerator(name = "ingrediente_sequence", sequenceName = "ingrediente_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingrediente_sequence")
    @Column(name="id", updatable = false)
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "familia",nullable = false,columnDefinition = "ENUM('LACTEO', 'CARNE', 'FRUTA', 'VERDURA', 'GRASA', 'LEGUMBRE')")
    FamiliaAlimenticia familiaAlimenticia;


    @Column(name="eng_name",nullable = false)
    String eng_name;

    public Ingrediente() {
    }

    public Ingrediente(FamiliaAlimenticia familiaAlimenticia, String eng_name) {
        this.familiaAlimenticia = familiaAlimenticia;
        this.eng_name = eng_name;
    }

    public Ingrediente(Long id, FamiliaAlimenticia familiaAlimenticia, String eng_name) {
        this.id = id;
        this.familiaAlimenticia = familiaAlimenticia;
        this.eng_name = eng_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FamiliaAlimenticia getFamiliaAlimenticia() {
        return familiaAlimenticia;
    }

    public void setFamiliaAlimenticia(FamiliaAlimenticia familiaAlimenticia) {
        this.familiaAlimenticia = familiaAlimenticia;
    }

    public String getEng_name() {
        return eng_name;
    }

    public void setEng_name(String eng_name) {
        this.eng_name = eng_name;
    }

    @Override
    public String toString() {
        return "Ingrediente [eng_name=" + eng_name + ", familiaAlimenticia=" + familiaAlimenticia + ", id=" + id + "]";
    }

    
}
