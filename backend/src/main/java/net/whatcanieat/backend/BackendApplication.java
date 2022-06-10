package net.whatcanieat.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.whatcanieat.backend.enums.Continente;
import net.whatcanieat.backend.enums.Sabor;
import net.whatcanieat.backend.enums.Temperatura;
import net.whatcanieat.backend.plato.PlatoRepository;
import net.whatcanieat.backend.plato.Plato;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
