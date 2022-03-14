package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sakila.model.AdressModel;

@Repository
public interface AdressRepository extends JpaRepository<AdressModel, Long>{
	
	
	

}
