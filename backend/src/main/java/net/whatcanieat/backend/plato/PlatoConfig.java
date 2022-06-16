package net.whatcanieat.backend.plato;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.whatcanieat.backend.enums.Continente;
import net.whatcanieat.backend.enums.Sabor;
import net.whatcanieat.backend.enums.Temperatura;

@Configuration
public class PlatoConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlatoRepository repository){
        return args -> {
            Plato tortilla = new Plato("Tortilla de papas", "Spanish Tortilla", Temperatura.CALIENTE, Sabor.SALADO, Continente.EUROPA, "España");
            Plato fideos = new Plato( "Fideos", "Pasta", Temperatura.CALIENTE, Sabor.SALADO, Continente.EUROPA, "Italia");
            Plato arrozFrito = new Plato("Arroz frito", "Fried rice", Temperatura.CALIENTE, Sabor.SALADO, Continente.EUROPA, "China");

            repository.saveAll(List.of(tortilla,fideos,arrozFrito));
        };

        
    }
}
