package com.postalpay.controller;

import java.util.List;

import com.postalpay.model.Bollettino;
import com.postalpay.model.Utente;
import com.postalpay.service.BollettinoService;
import com.postalpay.service.ContoCorrenteService;
import com.postalpay.service.UtenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class PostalPayController {
	@Autowired
	private ContoCorrenteService contoCorrenteService;
	@Autowired
	private UtenteService utenteService;
	@Autowired
	private BollettinoService bollettinoService;
	
	
	@GetMapping("/bollettino/all")
	public ResponseEntity<List<Bollettino>> getBollettini() {
		List<Bollettino> result = bollettinoService.getAll();
		return new ResponseEntity<List<Bollettino>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/bollettino/{id}")
	public ResponseEntity<Bollettino> getDatiBollettino(@PathVariable("id") Long id) {
		Bollettino result = bollettinoService.findById(id);
		return new ResponseEntity<Bollettino>(result, HttpStatus.OK);
	}
	
	@GetMapping("/utente/{id}")
	public ResponseEntity<Utente> getDatiUtente(@PathVariable("id") Long id) {
		Utente result = utenteService.findById(id);
		return new ResponseEntity<Utente>(result, HttpStatus.OK);
	}
	
	@PostMapping("/insert/bollettino")
	public ResponseEntity<Bollettino> inserisciDaPagare(@RequestBody Bollettino bollettino) {
		Bollettino result = bollettinoService.insertBollettino(bollettino);
		return new ResponseEntity<Bollettino>(result, HttpStatus.CREATED);
	}
	@PostMapping("/insert/utente")
	public ResponseEntity<Utente> inserisciUtente(@RequestBody Utente utente) {
		Utente result = utenteService.inserisciDati(utente);
		return new ResponseEntity<Utente>(result, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/bollettino")
	public ResponseEntity<Bollettino> inserisciPagato(@RequestBody Bollettino bollettino) {
		Bollettino result = bollettinoService.insertBollettino(bollettino);
		return new ResponseEntity<Bollettino>(result, HttpStatus.OK);
	}
}
