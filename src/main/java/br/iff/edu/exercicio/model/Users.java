package br.iff.edu.exercicio.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Users extends JpaRepository<User,Long>{
	
}