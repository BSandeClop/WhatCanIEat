package net.whatcanieat.backend.platoingrediente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlatoIngrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long idPlato;
    private long idIngrediente;
}
