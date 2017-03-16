/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Airport;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class AirportDAO extends DAO <Airport,String>{

    boolean succed = false;

    public AirportDAO() {

        super();

    }
    
    /*
     cette méthode ajoutera un objet de type airport à la bdd 
    elle prend comme argument l'obj à inserrer dans la table
     et retourne ce qui a effectivement été ajouté à la table 
    
    */
    

    @Override
    public Airport creer(Airport obj) {

        Airport ap = (Airport) obj;

        
        if (this.bddmanager.connect()){
        try {
                String query = " INSERT INTO airports VALUES (?, ?, ?)";
                PreparedStatement stInsert = this.bddmanager.getConnectionManager().prepareStatement(query);
                stInsert.setString(1, ap.getCode_AITA());
                stInsert.setString(2, ap.getCity());
                stInsert.setString(3, ap.getCountry());
                
                System.out.println(stInsert.toString());
                
                stInsert.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(AirportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ap;

    }
     return ap;
    }
    
    /* 
    
    Cette méthode prend en argument l'obj a supprimer de la table (créé avec le constructeur contenant uniquement la clef primaire)
    Elle retourne un boolean si la suppression a été effectué ou non
        
    */
    
    
    @Override
    public boolean supprimer(String obj) {
        
          String apKey =  obj;
        
        if (this.bddmanager.connect())
        {
                
              try {
                String querySuppr = " DELETE FROM airports WHERE aita = ?";
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(querySuppr);
                
                stSuppr.setString(1, apKey);
                
                System.out.println(stSuppr.toString());
                
                stSuppr.executeUpdate();
            
              } catch (SQLException ex) {
                 ex.printStackTrace();
                 
                 return succed;
              }

          

        
        }
    
    return succed;
    }
        
    /* 
    
        Cette methode retourne la table entière
    
    */
    
    @Override
    public ArrayList getAll() {
        ArrayList<Airport> airportList = new ArrayList<>();
        if (this.bddmanager.connect()) {
            try {

                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM airports";
                ResultSet rs = st.executeQuery(requete);

                while (rs.next()) {

                    Airport ap = new Airport(rs.getString("aita"), rs.getString("city"), rs.getString("pays"));
                    airportList.add(ap);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return airportList;
            }

        }
        return airportList;
    }



    @Override
    public Airport update(Airport obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Airport find(String id) {
        
        
        Airport airport = new Airport();
        
        if (this.bddmanager.connect()) {
            try {
                String requete = "SELECT * FROM airports WHERE aita = ?";
                Statement stFind = this.bddmanager.getConnectionManager().createStatement();
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(requete);
                
                stSuppr.setString(1, id);
                
                ResultSet rs = stFind.executeQuery(requete);
                rs.next();
                airport = new Airport(rs.getString("aita"), rs.getString("city"), rs.getString("pays"));

                
            } catch (SQLException ex) {
                ex.printStackTrace();
 
            }

        }
        return airport;
    }
        
    }


