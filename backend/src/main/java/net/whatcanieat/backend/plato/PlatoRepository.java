package net.whatcanieat.backend.plato;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.whatcanieat.backend.enums.Continente;
import net.whatcanieat.backend.enums.Sabor;


@Repository
public interface PlatoRepository extends CrudRepository<Plato, Long>{
    List<Plato> findByEngName(String engName);
    List<Plato> findByOgName(String ogName);
    List<Plato> findBySabor(Sabor sabor);
    List<Plato> findByContinente(Continente continente);
    List<Plato> findByPais(String pais);

    Plato findById(long id);

}
