package br.com.kvmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvmedia.entity.ModeloEntity;

@Repository
public interface ModeloRepository extends JpaRepository<ModeloEntity, Integer> {

}
