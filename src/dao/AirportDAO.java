/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Airport;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AirportDAO extends DAO<Airport, String> {

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
    public Airport creer(Airport airport) {

        Airport ap = new Airport();

        if (this.bddmanager.connect()) {
            try {
                String query = "INSERT INTO airports VALUES (?, ?, ?)";
                PreparedStatement stInsert = this.bddmanager.getConnectionManager().prepareStatement(query);
                stInsert.setString(1, airport.getCode_AITA().toUpperCase());
                stInsert.setString(2, airport.getCity());
                stInsert.setString(3, airport.getCountry());

                System.out.println(stInsert.toString());

                stInsert.executeUpdate();

                ap = this.find(airport.getCode_AITA());

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return ap;

        }
        return ap;
    }

    /* 
    
    Cette méthode prend en argument l'obj a supprimer de la table 
    (créé avec le constructeur contenant uniquement la clef primaire)
    Elle retourne un boolean si la suppression a été effectué ou non
        
     */
    @Override
    public boolean supprimer(String obj) {

        String airportKey = obj;

        if (this.bddmanager.connect()) {

            try {
                String querySuppr = " DELETE FROM airports WHERE aita = ?";
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(querySuppr);

                stSuppr.setString(1, airportKey);

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

    /*
    
    Cette méthode prend en argument l'id de la ligne a changer et un objet de
    type aéroport qui est les modif à apporter 
    
     */
    @Override
    public Airport update(String id, Airport obj) {

        Airport ap = (Airport) obj;

        if (this.bddmanager.connect()) {
            try {
                String query = " UPDATE airports SET aita =? , city=?, pays =? where aita=?";
                PreparedStatement stUpdate = this.bddmanager.getConnectionManager().prepareStatement(query);
                stUpdate.setString(1, ap.getCode_AITA());
                stUpdate.setString(2, ap.getCity());
                stUpdate.setString(3, ap.getCountry());
                stUpdate.setString(4, id);

                System.out.println(stUpdate.toString());

                stUpdate.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return ap;

        }
        return ap;
    }

    /*
    
    Cette méthode retourne l'aéroport avec le code AITA donné en argument 
       
     */
    @Override
    public Airport find(String id) {

        Airport airport = new Airport();

        if (this.bddmanager.connect()) {
            try {
                String requete = "SELECT * FROM airports WHERE aita = ?";

                PreparedStatement stFind = this.bddmanager.getConnectionManager().prepareStatement(requete);

                stFind.setString(1, id);

                ResultSet rs = stFind.executeQuery();
                if(rs.next()) {
                    airport = new Airport(rs.getString("aita"), rs.getString("city"), rs.getString("pays"));
                }
                

            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }
        return airport;
    }

}
