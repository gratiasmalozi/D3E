package com.d3e1.projet.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.d3e1.projet.DTO.IService;
import com.d3e1.projet.Model.Produit;
import com.d3e1.projet.Model.UserEntity;
import com.d3e1.projet.Repository.ProduitRepository;
import com.d3e1.projet.Repository.UserRepository;

@RestController
@RequestMapping("/po")
public class ProduitController {
	@Autowired
	ProduitRepository produitRepo;

	@Autowired
	UserRepository userRepo;
	
	@Autowired
    IService service;
	
	
	@PostMapping("/produit/{idUser}")
	public ResponseEntity<?> enregistrement(@RequestBody Produit produit, @PathVariable long idUser) {
		
		this.service.addProduct(produit, idUser);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/produits")
	public long totalProduits() {
		return Produit.getTotal();
	}

	/*@PostMapping("produit")
    public String enregistrement(@RequestBody Produit produit, @PathVariable("idUser") long idUser) {
       System.out.println("555555555555555555555555555555555555555555555555");
       service.addProduct(produit, idUser);
       return "retour fonction addproduct";
	
	
    
    }*/
	/*@PostMapping("/produit")
    public String enregistrement(@RequestBody Produit produit, @PathVariable("idUser") long idUser) {
		System.out.println("gjergerghjerogjergjerjgerjgejrgejrgjergjerjogergjerogjerjgerjgerjgerjgrjgergjergjergjerjgerjg");
		return "coucou";
		UserEntity user = userRepo.findById(idUser).get();
		Produit p = produitRepo.findByNom(produit.getNom());
		if(p == null) {
			produitRepo.save(produit);
			return "enregistrement effectue";
		}else {
			p.setNombre(p.getNombre()+produit.getNombre());
			user.setProduit(produit);
			userRepo.save(user);
			this.produitRepo.save(p);
			return "enregistrement non effectue"	;
		}
	}*/
	/*@GetMapping("/clyford")
	public String testeur() {
		return "ceci est un test!!!";
	}*/
	/*@PostMapping("/produit2/{idUser}")
	public String ajoutsimple(@PathVariable("idUser") long idUser, @RequestBody Produit produit) {
		UserEntity user = userRepo.findById(idUser).get();
		Produit p = produitRepo.findByNom(produit.getNom());
		if(p == null) {
			produitRepo.save(produit);
			return "enregistrement effectue";
		}else {
			p.setNombre(p.getNombre()+produit.getNombre());
			user.setProduit(produit);
			userRepo.save(user);
			this.produitRepo.save(p);
			return "enregistrement non effectue"	;
		}
	}*/
}	  
    


