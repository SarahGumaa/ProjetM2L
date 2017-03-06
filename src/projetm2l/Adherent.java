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

    /*Adherent(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobile() {
        return mobile;
    }
    
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissance;
    private String email;
    private String telephone;
    private String mobile;
    
    
    
    
    
    
 public Adherent(String nom, String prenom, String adresse, String dateNaissance, String email,String telephone, String mobile){
     this.nom=nom;
     this.prenom=prenom;
     this.adresse=adresse;
     this.dateNaissance=dateNaissance;
     this.email=email;
     this.telephone=telephone;
     this.mobile=mobile;
     
 
 }   
}
