package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sakila.model.ActorModel;

@Repository
public interface ActorRepository extends JpaRepository<ActorModel, Long>{
	
	
	

}
