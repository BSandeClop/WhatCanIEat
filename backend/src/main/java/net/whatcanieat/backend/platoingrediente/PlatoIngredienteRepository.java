package net.whatcanieat.backend.platoingrediente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoIngredienteRepository extends CrudRepository<PlatoIngrediente, Long>{
    
}
