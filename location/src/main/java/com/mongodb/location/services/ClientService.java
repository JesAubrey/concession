package com.mongodb.location.services;

import java.util.List;

import com.mongodb.location.models.Client;

public interface ClientService {
	
	List<Client> findAll();
	Client findById(int id);
	List<Client> findByNom(String nom);
	Client findByTelephone(String telephone);
	List<Client> findByEtat(boolean etat);
	Client findByCarte(String carte);
	void deleteByNom(String nom);
	void deleteById(int id);
	void deleteByTelephone(String telephone);
	void deleteByCarte(String carte);
	
}
