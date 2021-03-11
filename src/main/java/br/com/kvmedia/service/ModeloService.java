package br.com.kvmedia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kvmedia.entity.ModeloEntity;
import br.com.kvmedia.repository.ModeloRepository;

@Service
public class ModeloService {

	@Autowired
	private ModeloRepository modeloRepository;

	public ModeloEntity salvarModelo(ModeloEntity modeloEntity) {
		ModeloEntity mEntity = modeloRepository.save(modeloEntity);
		return mEntity;
	}

	public ModeloEntity buscarModelo(Integer idModelo) {
		Optional<ModeloEntity> mEntity = modeloRepository.findById(idModelo);
		return mEntity.get();
	}

	public void deletarModelo(Integer idModelo) {
		modeloRepository.deleteById(idModelo);
	}
}
