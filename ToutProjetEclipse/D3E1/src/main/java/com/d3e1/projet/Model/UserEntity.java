package com.d3e1.projet.Model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
@Entity
@Table(name = "utilisateur")
public class UserEntity{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
     @Column
 	@NotNull
 	private String nom;  //ou Entreprise
     @Column
 	@NotNull
 	private String prenom;
 	@NotNull
     @Column
	   private boolean enabled;
	@NotNull
     @Column
	   private String adresse;
	@NotNull
     @Column
     @Email
	   private String email;
	@NotNull
	
     @Column
	   private String tel;
	@NotNull
     @Column
	   private String motDePasse;
	
	@ManyToMany(mappedBy="users")
	private List<Produit> produit;
	   
	   public UserEntity(){
		   
	   }
	  
	  // @OneToMany /*(cascade = CascadeType.PERSIST, mappedBy = "author")*/
	  //  List<ProduitsEntity> produits = new ArrayList<>();
           
	  
	
	public UserEntity( String nom, String prenom, boolean enabled,String adresse, 
     String email, String tel, String motDePasse ) {
		   
		   this.nom = nom;
		   this.prenom = prenom;
		   this.enabled = enabled;
		   this.adresse = adresse;
		   this.email = email;
		   this.tel = tel;
		   this.motDePasse = motDePasse;	   
	   
}
	

	
	/* public List<ProduitsEntity> getProduits() {
			return produits;
		}

		public void setProduits(List<ProduitsEntity> produits) {
			this.produits = produits;
		}
*/

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
	
	
	public List<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit.add(produit);
	}

	@Override
	  public String toString() {
	    return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom +", enabled=" + enabled + ", adresse=" + adresse + ", email=" + email +", tel="+ tel +", motDePasse=" + motDePasse + "]";
	  }

	
	}
