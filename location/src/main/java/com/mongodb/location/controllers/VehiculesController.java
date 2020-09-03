package com.mongodb.location.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.location.models.Categorie;
import com.mongodb.location.models.Vehicule;
import com.mongodb.location.services.VehiculeService;

@RestController
@RequestMapping(value="/vehicules")
public class VehiculesController {

	
	private VehiculeService vehiculeService;
	private static int i=0;
	
	@Autowired
	public VehiculesController(final VehiculeService vehiculeService) {
		this.vehiculeService=vehiculeService;
	}	
	
	
	
	private static List<Vehicule> lesVehicules = new ArrayList<>();
	static {
		Categorie c1 = new Categorie("B2");
		Vehicule v1 = new Vehicule("mercedes", "AMG", "bombarde", "XXX-tentation", c1, "12-05-2013", 50.0);
		Vehicule v2 = new Vehicule("Citroen", "C3", "citadine", "XXX-000-AAA", c1, "18-03-2010", 22.0);
		lesVehicules.add(v1);
		lesVehicules.add(v2);
	}
	
	
	
	
	
	
	
	
	@GetMapping(value= {"/index", "/"})
	public List<Vehicule> getAllVehicule() {
		return this.vehiculeService.findAll();
	}
	
	@GetMapping(value= {"/date/{date}"})
	public List<Vehicule> getVehiculebyDate(@PathVariable final String date) {
		return this.vehiculeService.findByDate(date);
	}
	
	@GetMapping(value= {"/identifiant/{id}"})
	public Vehicule getVehiculeById(@PathVariable final int id) {
		return this.vehiculeService.findById(id);
	}
	
   @GetMapping(value = "/matricule/{immatriculation}")
    public Vehicule getVehiculeByImmatriculation(@PathVariable final String immatriculation) {
        return this.vehiculeService.findByImmatriculation(immatriculation);
    }

/*	    @PostMapping(value = "/save")
	    public ReponseEntity<?> saveOrUpdate(@RequestBody Vehicule vehicule) {
	         vehiculeService.saveOrUpdateVehicule(vehicule);
	         return new ReponseEntity("Vehicule ajoute", HttpStatus.OK);
	    }

*/
   
   @RequestMapping(value="/creer")
   public String createVehicule() {
	   Vehicule vehicule = lesVehicules.get(i);
	   i++;
	   this.vehiculeService.saveOrUpdateVehicule(vehicule);
	   return "Insert: "+vehicule;
   }
   
    @RequestMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable final int id) {
    	Vehicule v = vehiculeService.findById(id);
        this.vehiculeService.deleteById(id);
        return "Deleted: "+v;
    }
    
    
	
}
