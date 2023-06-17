package com.postalpay.service;

import java.util.Optional;

import com.postalpay.exception.NotEnabledException;
import com.postalpay.model.ContoCorrente;
import com.postalpay.repository.ContoCorrenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContoCorrenteService {
	@Autowired
	private ContoCorrenteRepository repository;
	
	public Boolean checkEnabling(String codiceCC) {
		if (repository.findContoCorrenteByCodiceCC(codiceCC).isPresent())
			return true;
		else
			throw new NotEnabledException("Conto corrente non abilitato!");
	}
}
