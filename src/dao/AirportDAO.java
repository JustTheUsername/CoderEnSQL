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
public class AirportDAO extends DAO {

    boolean succed = false;

    public AirportDAO() {

        super();

    }

    @Override
    public boolean creer(Object obj) {

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
            

            succed = true;
        } catch (SQLException ex) {
            Logger.getLogger(AirportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return succed;

    }
     return succed;
    }

    @Override
    public boolean supprimer(Object obj) {
        
          Airport ap = (Airport) obj;
        
        if (this.bddmanager.connect())
        {
                
              try {
                String querySuppr = " DELETE FROM airports WHERE aita = ?";
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(querySuppr);
                
                stSuppr.setString(1, ap.getCode_AITA());
                
                System.out.println(stSuppr.toString());
                
                stSuppr.executeUpdate();
            
              } catch (SQLException ex) {
                 ex.printStackTrace();
                 
                 return succed;
              }

          

        
        }
    
    return succed;
    }

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
    public Object find(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
