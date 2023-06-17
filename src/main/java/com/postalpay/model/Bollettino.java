package com.postalpay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Bollettino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codice_bollettino", unique = true)
	private String codiceBollettino;
	private String cc;
	private Long importo;
	private String causale;

	private String nomeUtente;
	private String cognomeUtente;
	private String codiceCarta;
	private boolean pagato;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodiceBollettino() {
		return codiceBollettino;
	}
	public void setCodiceBollettino(String codiceBollettino) {
		this.codiceBollettino = codiceBollettino;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public Long getImporto() {
		return importo;
	}
	public void setImporto(Long importo) {
		this.importo = importo;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public String getNomeUtente() {
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	public String getCognomeUtente() {
		return cognomeUtente;
	}
	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}
	public String getCodiceCarta() {
		return codiceCarta;
	}
	public void setCodiceCarta(String codiceCarta) {
		this.codiceCarta = codiceCarta;
	}
	public boolean isPagato() {
		return pagato;
	}
	public void setPagato(boolean pagato) {
		this.pagato = pagato;
	}
	
	
}
