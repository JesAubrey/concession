package com.mongodb.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.location.dao.VehiculeRepository;
import com.mongodb.location.models.Vehicule;

@Repository
public class VehiculeServiceImpl implements VehiculeService {
	
	private VehiculeRepository vehiculeRepository;
	
	@Autowired
	public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
		this.vehiculeRepository=vehiculeRepository;
	}


	@Override
	public List<Vehicule> findAll() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicule findByImmatriculation(String immatriculation) {
		return vehiculeRepository.findByImmatriculation(immatriculation);
	}

	@Override
	public void saveOrUpdateVehicule(Vehicule vehicule) {
		if (vehicule.getId()==0) {
			int nbEntitee = (int) vehiculeRepository.count();
			int idSelectionne=1;
			for(int i=1;i<=nbEntitee;i++) {
				if(findById(i)==null) {
					idSelectionne=i;
					vehicule.setId(idSelectionne);
					vehiculeRepository.insert(vehicule);
					return;
				}	
			}
			idSelectionne = ++nbEntitee;
			vehicule.setId(idSelectionne);
			vehiculeRepository.insert(vehicule);
		}
			
		else
			vehiculeRepository.save(vehicule);

	}

	@Override
	public void deleteById(int id) {
		vehiculeRepository.deleteById(id);

	}
	
	@Override
	public Vehicule findById(int id) {
		Vehicule vehicule = null;
		Vehicule v = vehiculeRepository.findById(id);
			if(v!=null)
				vehicule = v;
		return vehicule;
	}


	@Override
	public List<Vehicule> findByDate(String date) {
		return vehiculeRepository.findByDate(date);
	}

}
