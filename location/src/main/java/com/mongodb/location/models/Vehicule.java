package com.mongodb.location.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Vehicules")
public class Vehicule {

	@Id
	private int id;
	
	@Field("Marque")
	private String marque;
	
	@Field("Modele")
	private String modele;
	
	@Field("Description")
	private String description;
	

	@Field("Immatriculation")
	private String immatriculation;
	
	@Field("Categorie")
	private Categorie categorie;
	
	/**
	 * informe de la disponibilité de la voiture true: disponible; false:indispo
	 */
	@Field("Etat")
	private boolean etat;
	
	@Field("Date")
	private String date;
	
	@Field("Prix")
	private Double prix;
	
	public Vehicule() {}
	
	public Vehicule(String marque, String modele, String description, 
			String immatriculation, Categorie categorie, String date, Double prix) {
		this.marque=marque;
		this.modele=modele;
		this.description=description;
		this.immatriculation=immatriculation;
		this.categorie=categorie;
		this.date=date;
		this.prix=prix;
		this.etat=true;
	}
	
	@Override
	public String toString() {
		return "Marque: "+marque+"\tModele: "+modele+"\nCategorie:"+categorie
				+"\nPrix par jour: "+prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	

}
