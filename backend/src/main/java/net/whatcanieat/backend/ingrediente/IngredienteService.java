package net.whatcanieat.backend.ingrediente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteService {
    
    private final IngredienteRepository ingredienteRepository;


    @Autowired
    public IngredienteService(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    public List<Ingrediente> getIngredientes(){
        return ingredienteRepository.findAll();
    }
}
