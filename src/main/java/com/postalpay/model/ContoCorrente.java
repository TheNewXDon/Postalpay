package com.postalpay.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ContoCorrente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codice_CC", length = 6, nullable = false, unique = true)
	private String codiceCC;
	
	@Column(nullable = false)
	private String intestatario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceCC() {
		return codiceCC;
	}

	public void setCodiceCC(String codiceCC) {
		this.codiceCC = codiceCC;
	}

	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}
	
	
	
}
