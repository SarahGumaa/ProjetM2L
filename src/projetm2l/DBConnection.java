/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetm2l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yassine
 */
public class DBConnection extends GestionAdherent{
    private static Connection conn;
    private static final String USERNAME= "root";
    private static final String PASSWORD="";
    private static final String CONN_STRING= "jdbc:mysql://localhost:3306/basem2l";
    public static void addAdherent(Adherent a){
        
  try{
      conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
      System.out.println("Connecté!");
      Statement stmt = (Statement ) conn.createStatement();

      String insert = "INSERT INTO adherent(nom,prenom,adresse,email,telephone,mobile,date_naissance) "
              + "VALUES ('"+a.getNom()+"','"+a.getPrenom()+"','"+a.getAdresse()+"','"+a.getEmail()+"','"+a.getTelephone()+"','"+a.getMobile()+"','"+a.getDateNaissance()+"');";
      stmt.executeUpdate(insert);
  }catch (SQLException e){
    System.err.println(e);
  }
    }
}
