package net.whatcanieat.backend.ingrediente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredienteController {
    
    private final IngredienteService ingredienteService;

    @Autowired
    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }



    @GetMapping(path = "/api/v1/ingrediente")
    public List<Ingrediente> getIngredientes(){
        return ingredienteService.getIngredientes();
    }
}
