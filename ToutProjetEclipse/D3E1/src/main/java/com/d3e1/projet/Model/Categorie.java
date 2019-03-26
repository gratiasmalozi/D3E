package com.d3e1.projet.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
/*etter
@Setter  */
public class Categorie {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
	    
	   @Column(unique=true)
	   private String nom;
	   
	   
	   @OneToMany(mappedBy="categorie")
	   private List<Produit> produits = new ArrayList<>();

	public Categorie() {
		
	}

	public Categorie(String nom, List<Produit> produits) {
		this.nom = nom;
		this.produits = produits;
	}
	
	public void ajoutProduit(Produit produit) {
		produits.add(produit);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	

}
