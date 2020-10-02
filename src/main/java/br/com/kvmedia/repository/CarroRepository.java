package br.com.kvmedia.repository;

import javax.persistence.EntityManager;

import br.com.kvmedia.entity.Carro;

public class CarroRepository {

	private EntityManager em;

	public CarroRepository(EntityManager em) {
		this.em = em;
	}

	public void insert(Carro carro) {

		em.getTransaction().begin();
		em.persist(carro);
		em.getTransaction().commit();
	}

	public Carro update(Carro carro) {

		em.getTransaction().begin();
		Carro retCarro = em.merge(carro);
		em.getTransaction().commit();

		return retCarro;
	}

	public void delete(Carro carro) {

		em.getTransaction().begin();
		em.remove(carro);
		em.getTransaction().commit();
	}

	public Carro select(Integer idCarro) {
		return em.find(Carro.class, idCarro);
	}
}
