package net.whatcanieat.backend.plato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatoService {

	private final PlatoRepository platoRepository;

	@Autowired
	public PlatoService(PlatoRepository platoRepository) {
		this.platoRepository = platoRepository;
	}

	public List<Plato> getPlatos() {
		return platoRepository.findAll();
	}

}
