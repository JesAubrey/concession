package com.mongodb.location.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.location.models.Vehicule;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {

	Vehicule findByImmatriculation(String immatriculation);
	Vehicule findById(int id);
	void deleteById(int id);
	List<Vehicule> findByDate(String date);
}
