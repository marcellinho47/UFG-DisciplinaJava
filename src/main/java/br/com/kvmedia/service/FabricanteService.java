package br.com.kvmedia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kvmedia.entity.FabricanteEntity;
import br.com.kvmedia.repository.FabricanteRepository;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository;

	public FabricanteEntity salvarFabricante(FabricanteEntity fabricanteEntity) {
		FabricanteEntity fEntity = fabricanteRepository.save(fabricanteEntity);
		return fEntity;
	}

	public FabricanteEntity buscarFabricante(Integer idFabricante) {
		Optional<FabricanteEntity> findById = fabricanteRepository.findById(idFabricante);
		return findById.get();
	}

	public void deletarFabricante(Integer idFabricante) {
		fabricanteRepository.deleteById(idFabricante);
	}
}
