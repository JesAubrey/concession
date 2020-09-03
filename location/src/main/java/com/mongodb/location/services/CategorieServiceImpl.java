package com.mongodb.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.location.dao.CategorieRepository;
import com.mongodb.location.models.Categorie;

@Repository
public class CategorieServiceImpl implements CategorieService {

	private CategorieRepository categorieRepository;
	
	@Autowired
	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		this.categorieRepository=categorieRepository;
	}
	
	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie findByNom(String nom) {
		return categorieRepository.findByNom(nom);
	}

	@Override
	public Categorie findById(int id) {
		return categorieRepository.findById(id);
	}

	@Override
	public void deleteByNom(String nom) {
		categorieRepository.deleteByNom(nom);

	}

	@Override
	public void deleteById(int id) {
		categorieRepository.deleteById(id);

	}

	@Override
	public void saveOrUpdateVehicule(Categorie categorie) {
		if (categorie.getId()==0) {
			int nbEntitee = (int) categorieRepository.count();
			int idSelectionne=1;
			for(int i=1;i<=nbEntitee;i++) {
				if(findById(i)==null) {
					idSelectionne=i;
					categorie.setId(idSelectionne);
					categorieRepository.insert(categorie);
					return;
				}	
			}
			idSelectionne = ++nbEntitee;
			categorie.setId(idSelectionne);
			categorieRepository.insert(categorie);
		}
			
		else
			categorieRepository.save(categorie);
	}

}
