package com.d3e1.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d3e1.projet.Model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public UserEntity findByNom(String nom);

	public UserEntity findByEmail(String email);

	
}
