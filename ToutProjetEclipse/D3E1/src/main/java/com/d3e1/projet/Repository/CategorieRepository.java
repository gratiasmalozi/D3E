package com.d3e1.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d3e1.projet.Model.Categorie;
import com.d3e1.projet.Model.Produit;

public interface CategorieRepository  extends JpaRepository<Categorie, Long>{
	public Produit findByNom(String nom);

}
