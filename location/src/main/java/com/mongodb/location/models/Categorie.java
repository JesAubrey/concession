package com.mongodb.location.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="categorie")
public class Categorie {
	
	@Id
	private int id;
	
	@Field("nom")
	private String nom;

	@Field("description")
	private String description;
	
	public Categorie() {}
	
	public Categorie(String nom) {
		this.nom=nom;
		description="";
	}
	
	public Categorie(String nom, String description) {
		this.nom = nom;
		this.description=description;
	}
	
	@Override
	public String toString() {
		if (description.equalsIgnoreCase(""))
			return nom;
		else
			return nom+"description: "+description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
