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
public class Recherche extends MoteurDeRecherche{
   
    public String getMotCle() {
          return motCle;
    }
    private String motCle;
    public Recherche(String motCle){
    this.motCle=motCle;
    }
}
