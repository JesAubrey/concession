package com.mongodb.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.location.dao.ClientRepository;
import com.mongodb.location.models.Client;

@Repository
public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;
	
	
	@Autowired
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository=clientRepository;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findById(int id) {
		return clientRepository.findById(id);
	}

	@Override
	public List<Client> findByNom(String nom) {
		return clientRepository.findByNom(nom);
	}

	@Override
	public Client findByTelephone(String telephone) {
		return clientRepository.findByTelephone(telephone);
	}

	@Override
	public List<Client> findByEtat(boolean etat) {
		return clientRepository.findByEtat(etat);
	}

	@Override
	public Client findByCarte(String carte) {
		return clientRepository.findByCarte(carte);
	}

	@Override
	public void deleteByNom(String nom) {
		clientRepository.deleteByNom(nom);

	}

	@Override
	public void deleteById(int id) {
		clientRepository.deleteById(id);

	}

	@Override
	public void deleteByTelephone(String telephone) {
		clientRepository.deleteByTelephone(telephone);

	}

	@Override
	public void deleteByCarte(String carte) {
		clientRepository.deleteByCarte(carte);

	}

}
