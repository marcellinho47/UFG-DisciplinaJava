package br.com.kvmedia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kvmedia.entity.CarroEntity;
import br.com.kvmedia.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public CarroEntity salvarCarro(CarroEntity carroEntity) {
		CarroEntity carro = carroRepository.save(carroEntity);
		return carro;
	}

	public CarroEntity buscarCarro(Integer idCarro) {
		Optional<CarroEntity> findById = carroRepository.findById(idCarro);
		return findById.get();
	}

	public void deletarCarro(Integer idCarro) {
		carroRepository.deleteById(idCarro);
	}
}
