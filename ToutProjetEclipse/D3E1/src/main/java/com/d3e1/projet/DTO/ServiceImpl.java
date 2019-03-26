package com.d3e1.projet.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d3e1.projet.Model.Produit;
import com.d3e1.projet.Model.UserEntity;
import com.d3e1.projet.Repository.ProduitRepository;
import com.d3e1.projet.Repository.UserRepository;

@Service
public class ServiceImpl implements IService{
	
	@Autowired
	ProduitRepository produitRepo;

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void addProduct(Produit produit, long idUser) {
		UserEntity user = userRepo.findById(idUser).get();
		Produit p = produitRepo.findByNom(produit.getNom());
		if(p == null) {
			produitRepo.save(produit);
			Produit.setTotal(Produit.getTotal()+produit.getNombre());
			System.out.println("Totallllllllllllllllllllllllllllll"+Produit.getTotal());
		}else {
			p.setNombre(p.getNombre()+produit.getNombre());
			user.setProduit(produit);
			userRepo.save(user);
			this.produitRepo.save(p);
			Produit.setTotal(Produit.getTotal()+produit.getNombre());
			System.out.println("Resultattttttttttttttttttttttttttttt"+Produit.getTotal());
		}
		
		
	}

}
