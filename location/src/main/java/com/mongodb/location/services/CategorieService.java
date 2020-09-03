package com.mongodb.location.services;

import java.util.List;

import com.mongodb.location.models.Categorie;

public interface CategorieService {

	List<Categorie> findAll();
	Categorie findByNom(String nom);
	Categorie findById(int id);
	void deleteByNom(String nom);
	void deleteById(int id);
	void saveOrUpdateVehicule(Categorie categorie);
}
