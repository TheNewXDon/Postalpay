package com.postalpay.service;

import com.postalpay.model.Utente;
import com.postalpay.repository.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository repository;
	
	public Utente inserisciDati(Utente utente) {
		return repository.save(utente);
	}
	
	public Utente findById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Non trovato!"));
	}
}
