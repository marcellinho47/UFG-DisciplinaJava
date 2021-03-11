package br.com.kvmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvmedia.entity.CarroEntity;

@Repository
public interface CarroRepository extends JpaRepository<CarroEntity, Integer> {

}
