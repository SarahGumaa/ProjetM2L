/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetm2l;

/**
 *
 * @author user
 */
public class Adherent extends GestionAdherent{
    
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissance;
    private String email;
    private int telephone;
    private int mobile;
    
    
    
    
    
 public Adherent(String nom, String prenom, String adresse, String dateNaissance, String email,int telephone, int mobile){
     this.nom=nom;
     this.prenom=prenom;
     this.adresse=adresse;
     this.dateNaissance=dateNaissance;
     this.email=email;
     this.telephone=telephone;
     this.mobile=mobile;
     
 
 }   
}
