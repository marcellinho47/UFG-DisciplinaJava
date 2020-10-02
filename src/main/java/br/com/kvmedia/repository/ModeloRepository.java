package br.com.kvmedia.repository;

import javax.persistence.EntityManager;

import br.com.kvmedia.entity.Modelo;

public class ModeloRepository {

	private EntityManager em;

	public ModeloRepository(EntityManager em) {

		this.em = em;
	}

	public void insert(Modelo modelo) {

		em.getTransaction().begin();
		em.persist(modelo);
		em.getTransaction().commit();
	}

	public Modelo update(Modelo modelo) {

		em.getTransaction().begin();
		Modelo retModelo = em.merge(modelo);
		em.getTransaction().commit();

		return retModelo;
	}

	public void delete(Modelo modelo) {

		em.getTransaction().begin();
		em.remove(modelo);
		em.getTransaction().commit();
	}

	public Modelo select(Integer idModelo) {
		return em.find(Modelo.class, idModelo);
	}
}
