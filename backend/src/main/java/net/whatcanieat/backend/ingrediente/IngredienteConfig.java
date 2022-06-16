package net.whatcanieat.backend.ingrediente;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.whatcanieat.backend.enums.FamiliaAlimenticia;

@Configuration
public class IngredienteConfig {

    @Bean
    CommandLineRunner createIngredientes (IngredienteRepository ingredienteRepository){
        return args -> {
             Ingrediente ingrediente = new Ingrediente(FamiliaAlimenticia.CARNE, "Rib eye");
             Ingrediente ingrediente2 = new Ingrediente(FamiliaAlimenticia.GRASA, "Clarified butter");
             Ingrediente ingrediente3 = new Ingrediente(FamiliaAlimenticia.LEGUMBRE, "Lentils");

             ingredienteRepository.saveAll(List.of(ingrediente,ingrediente2,ingrediente3));
        };
    }
}
