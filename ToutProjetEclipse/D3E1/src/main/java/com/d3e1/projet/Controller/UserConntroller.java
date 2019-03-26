package com.d3e1.projet.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d3e1.projet.Model.UserEntity;
import com.d3e1.projet.Repository.UserRepository;



@RestController
@CrossOrigin
@RequestMapping("/pi")

 class UserController {
	
	@Autowired
    UserRepository userRepository;
	
	
	
	@PostMapping("/user")
    public String sinscrire(@RequestBody UserEntity user) {
        UserEntity dbNom = userRepository.findByNom(user.getNom());
        UserEntity dbMail = userRepository.findByEmail(user.getEmail());
       
        if((dbNom==null) && (dbMail==null)){
        	System.out.println("gjfgjfigjfigjfjgfjgfjgfjgfjgfjgjfgjfgjfgjfgjjgfjgfjgfjgfjgfijgfjg");
            UserEntity utilisateur = new UserEntity(user.getNom(),user.getPrenom(),user.isEnabled(),
          user.getAdresse(),user.getEmail(),user.getTel(),user.getMotDePasse());
            userRepository.save(utilisateur);
            return "creation utilisateur réussie";
        }
        else
        	return "echec creation utilisateur";
    }
	@GetMapping("/kenza")
	public String testeur() {
		return "ceci est un test";
	}
	
	
	@ DeleteMapping ( "/User/{id}" )
	public String deleteUser ( @PathVariable("id") long id )
	 {
		Optional<UserEntity> userEntity = userRepository.findById(id);
		if(userEntity.isPresent()) {
			userRepository.delete(userEntity.get());
			return "suppression effectuée";
			
		}
		else
			return "echec suppression";
		
		//==============================================//		
	  
	  
	 }
	   
	@GetMapping ("/test")
    public String tes(@RequestBody UserEntity user) {
        UserEntity dbNom = userRepository.findByNom(user.getNom());
        UserEntity dbMail = userRepository.findByEmail(user.getEmail());
       
        if((dbNom==null) && (dbMail==null)){
        
            UserEntity utilisateur = new UserEntity(user.getNom(),user.getPrenom(),user.isEnabled(),
          user.getAdresse(),user.getEmail(),user.getTel(),user.getMotDePasse());
            userRepository.save(utilisateur);
            return "Gratias afficher OK !  ";
        }
        else
        	return " Utilisateurs non afficher";
    }
	
	@PutMapping("/test")
    public String modif(@RequestBody UserEntity user) {
        UserEntity dbNom = userRepository.findByNom(user.getNom());
        UserEntity dbMail = userRepository.findByEmail(user.getEmail());
       
        if((dbNom==null) && (dbMail==null)){
        
            UserEntity utilisateur = new UserEntity(user.getNom(),user.getPrenom(),user.isEnabled(),
          user.getAdresse(),user.getEmail(),user.getTel(),user.getMotDePasse());
            userRepository.save(utilisateur);
            return "Bien fait OK !  ";
        }
        else
        	return " je te modiff";
    }
	 
	
	
	/*
	@RequestMapping(value="/User")
	 public String test() {
		 return " Ca marche dans tout les coté";
	 }
	@DeleteMapping("/test")
	public String mm() {
		return "Mboté de moi";
	}
	 
	 @PostMapping("/valide")
	 public int val() {
		 return 2012012;
		 
	 }*/
	

}
