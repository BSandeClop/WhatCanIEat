package net.whatcanieat.backend.plato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.whatcanieat.backend.platoingrediente.PlatoIngredienteRepository;

@Service
public class PlatoService {
    //TODO Write code
    @Autowired
    private PlatoRepository platoRepo;
    @Autowired
    private PlatoIngredienteRepository platoIngRepo;

}
