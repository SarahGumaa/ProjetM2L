/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetm2l;
import java.sql.*;
/**
 *
 * @author user
 */
public class Connexion {
     String urlPilote="com.Mysql.jdbc.Driver";
    String urlBaseDonnees="jdbc:mysql://localhost:3306/basem2l";
    Connection con;
    
    public Connexion(){
//Chargement du pilote
        try{
            Class.forName(urlPilote);
             System.out.println("Chargement du pilote reussie");
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        //connexion a la bdd
        try{
            con=DriverManager.getConnection(urlBaseDonnees,"root","");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    Connection ObConnexion(){
        return con;
    }
}
