package br.com.kvmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvmedia.entity.FabricanteEntity;

@Repository
public interface FabricanteRepository extends JpaRepository<FabricanteEntity, Integer> {

}
