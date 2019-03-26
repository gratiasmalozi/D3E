package com.d3e1.projet.Model;

import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	private int nombre;
	private static int total=0;
	
	@JsonIgnore
    @ManyToOne
	@JoinColumn(name="idCategorie")  
	private Categorie categorie;
	
	@ManyToMany
	@JoinTable(name="ajout")
	private List<UserEntity> users;

	public Produit() {
		
	}

	public Produit(long id, Categorie categorie, String nom, int nombre) {
		this.id = id;
		this.categorie = categorie;
		this.nom = nom;
		this.nombre += nombre;
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

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Produit.total = total;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
        
		
	}


