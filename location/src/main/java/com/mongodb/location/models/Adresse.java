package com.mongodb.location.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Adresse {

	@Id
	private int id;
	
	@Field("Numero")
	private String numero;
	
	@Field("Rue")
	private String rue;
	
	@Field("Code")
	private String code;
	
	public Adresse() {}
	
	public Adresse(String numero, String rue, String code) {
		this.numero=numero;
		this.rue = rue;
		this.code=code;
	}
	
	@Override
	public String toString() {
		return numero+", "+rue+", "+code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
