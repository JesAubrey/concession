package com.mongodb.location.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.location.models.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {

	Categorie findByNom(String nom);
	Categorie findById(int id);
	void deleteByNom(String nom);
	void deleteById(int id);

}
