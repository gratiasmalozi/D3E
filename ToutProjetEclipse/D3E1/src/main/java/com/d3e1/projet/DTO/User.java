package com.d3e1.projet.DTO;

import java.util.ArrayList;
import java.util.List;

import com.d3e1.projet.Model.Produit;

public class User {
  
	 private Long id;
     
	   private String nom;  //ou Entreprise
     
	   private String prenom;
 	
	   private boolean enabled;
	
	   private String adresse;
	
	   private String email;
	
	   private String tel;
	
	   private String motDePasse;
	   
	   public User(){
		   
	   }
	  
	   
	    List<Produit> produits = new ArrayList<>();
           
	  
	
	public User( String nom, String prenom, boolean enabled,String adresse, 
     String email, String tel, String motDePasse ) {
		   
		   this.nom = nom;
		   this.prenom = prenom;
		   this.enabled = enabled;
		   this.adresse = adresse;
		   this.email = email;
		   this.tel = tel;
		   this.motDePasse = motDePasse;	   
	   
}
	

	
	 public List<Produit> getProduits() {
			return produits;
		}

		public void setProduits(List<Produit> produits) {
			this.produits = produits;
		}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
		
       	}
	
	}


