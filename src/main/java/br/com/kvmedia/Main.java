package br.com.kvmedia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.kvmedia.entity.Carro;
import br.com.kvmedia.entity.Modelo;
import br.com.kvmedia.repository.CarroRepository;
import br.com.kvmedia.repository.ModeloRepository;

public class Main {

	public static void main(String[] args) {
		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
			EntityManager em = emf.createEntityManager();

			ModeloRepository modeloRepository = new ModeloRepository(em);
			Modelo modelo = modeloRepository.select(1);

			CarroRepository carroRepository = new CarroRepository(em);
			Carro carro = carroRepository.select(2);

			carro = new Carro(null, 1, "GOL1234", 2020, "Azul", modelo);
			carroRepository.insert(carro);
			Carro carro2 = carroRepository.select(2);

			carro2.setAno(3030);
			carroRepository.update(carro2);

			carroRepository.delete(carro2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
