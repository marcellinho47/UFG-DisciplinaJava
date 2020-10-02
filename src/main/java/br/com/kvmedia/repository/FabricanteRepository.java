package br.com.kvmedia.repository;

import javax.persistence.EntityManager;

import br.com.kvmedia.entity.Fabricante;

public class FabricanteRepository {

	private EntityManager em;

	public FabricanteRepository(EntityManager em) {
		this.em = em;
	}

	public void insert(Fabricante fabricante) {

		em.getTransaction().begin();
		em.persist(fabricante);
		em.getTransaction().commit();
	}

	public Fabricante update(Fabricante fabricante) {

		em.getTransaction().begin();
		Fabricante retFabricante = em.merge(fabricante);
		em.getTransaction().commit();

		return retFabricante;
	}

	public void delete(Fabricante fabricante) {

		em.getTransaction().begin();
		em.remove(fabricante);
		em.getTransaction().commit();
	}

	public Fabricante select(Integer idFabricante) {
		return em.find(Fabricante.class, idFabricante);
	}
}
