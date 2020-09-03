package com.mongodb.location.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.location.models.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

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
