package com.postalpay.service;

import java.util.List;

import com.postalpay.model.Bollettino;
import com.postalpay.repository.BollettinoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BollettinoService {
	@Autowired
	private BollettinoRepository repository;
	@Autowired
	private ContoCorrenteService service;
	
	public List<Bollettino> getAll() {
		return repository.findAll();
	}
	
	public Bollettino findById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Non trovato!"));
	}
	
	public Bollettino findByCodiceBollettino(String codice) {
		return repository.findBollettinoByCodiceBollettino(codice)
				.orElseThrow(() -> new RuntimeException("Non trovato!"));
	}
	
	public Bollettino insertBollettino(Bollettino bollettino) {
		if (service.checkEnabling(bollettino.getCc()))
			return repository.save(bollettino);
		else
			System.err.print("ERRORE! CONTO CORRENTE NON ABILITATO!");
			return null;
	}
	
	public Bollettino updateBollettino(Bollettino bollettino) {
		return repository.save(bollettino);
	}
	
}
