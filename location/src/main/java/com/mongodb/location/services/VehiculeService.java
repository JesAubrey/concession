package com.mongodb.location.services;

import java.util.List;

import com.mongodb.location.models.Vehicule;

public interface VehiculeService {

	List<Vehicule> findAll();
	Vehicule findById(int id);
	Vehicule findByImmatriculation(String immatriculation);
	void saveOrUpdateVehicule(Vehicule vehicule);
	void deleteById(int id);
	List<Vehicule> findByDate(String date);
	
}
