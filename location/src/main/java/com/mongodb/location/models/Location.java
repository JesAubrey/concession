package com.mongodb.location.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="location")
public class Location {

	@Id
	private int id;
	
	@Field("Client")
	private Client client;
	
	@Field("Voiture")
	private Vehicule vehicule;
	
	@Field("Debut")
	private String debut;
	
	@Field("Fin")
	private String fin;
	
	@Field("Prix")
	private Double prix;
	
	public Location() {}
	
	public Location(Client client, Vehicule vehicule, String debut, String fin) {
		this.client=client;
		this.vehicule=vehicule;
		this.debut=debut;
		this.fin=fin;
		prix=50.0;
	}
	
	@Override
	public String toString() {
		return "Client: "+client+"\nVehicule: "+vehicule+"\nDebut: "
				+debut+"\tFin: "+fin+"\nPrix";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
}
