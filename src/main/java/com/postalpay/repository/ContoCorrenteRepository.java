package com.postalpay.repository;

import java.util.Optional;

import com.postalpay.model.ContoCorrente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoCorrenteRepository extends JpaRepository<ContoCorrente, Long>{
	
	public Optional<ContoCorrente> findContoCorrenteByCodiceCC(String codiceCC);

}
