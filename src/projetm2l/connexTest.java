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
public class connexTest {
    
 private static final String USERNAME= "root";
 private static final String PASSWORD="mdproot";
 private static final String CONN_STRING= "jdbc:mysql://localhost:3306/m2l";
    
public static void main(String[] args){
  Connection conn = null;  
  try{
      conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
      System.out.println("Connecté!");
      Statement stmt = (Statement ) conn.createStatement();
      String name = nom.getText();
      String prenom = "Yassine";
      String adresse = " " ;
      String  email = " " ;
      String telephone = " " ;
      String mobile = " " ;
      String date_naissance = " " ;
      String insert = "INSERT INTO adherent(nom,prenom,adresse,email,telephone,mobile,date_naissance) "
              + "VALUES ('"+nom+"','"+prenom+"','"+adresse+"','"+email+"','"+telephone+"','"+mobile+"','"+date_naissance+"');";
      stmt.executeUpdate(insert);
  }catch (SQLException e){
    System.err.println(e);
  }
}
}