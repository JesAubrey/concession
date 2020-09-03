package com.mongodb.location.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="client")
public class Client {
	
	@Id
	private int id;
	
	@Field("Nom")
	private String nom;
	
	@Field("Prenom")
	private String prenom;
	
	@Field("Adresse")
	@DBRef
	private Adresse adresse;
	
	@Field("Telephone")
	private String telephone;
	
	/**
	 * True si le compte est actif, false s'il est inactif
	 */
	@Field("EtatCompte")
	private boolean etat;
	
	@Field("Carte")
	private String carte;
	
	@Field("Location")
	@DBRef
	private List<Location> location;
	
	public Client() {}
	
	public Client(String nom, String prenom, Adresse adresse, String telephone) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.telephone=telephone;
		etat=false;
		location=new ArrayList<>();
	}
	
	public Client(String nom, String prenom, Adresse adresse, String telephone, String carte) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.telephone=telephone;
		this.carte=carte;
		etat=true;
		location=new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Nom: "+nom+"\tPrenom: "+prenom+"\ttelephone"+telephone
				+"\nAdresse"+adresse+"\nEtat du compte: "+etat;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public String getCarte() {
		return carte;
	}

	public void setCarte(String carte) {
		this.carte = carte;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}
	
	
}
