package com.d3e1.projet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d3e1.projet.Model.Categorie;
import com.d3e1.projet.Model.Produit;
import com.d3e1.projet.Model.UserEntity;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

	public Produit findByNom(String nom);
	
	public List<Produit> findByCategorie(Categorie categorie);

}
