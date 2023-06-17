package com.postalpay.repository;

import java.util.Optional;

import com.postalpay.model.Bollettino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BollettinoRepository extends JpaRepository<Bollettino, Long>{
	
	public Optional<Bollettino> findBollettinoByCodiceBollettino(String codiceBollettino);

}
