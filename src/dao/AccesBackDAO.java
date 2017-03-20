/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.AccesBack;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AccesBackDAO extends DAO<AccesBack, Long> {

    boolean succed = false;

    /*
    Cette méthode ajoutera un objet de type airport à la bdd 
    elle prend comme argument l'obj à inserrer dans la table
    et retourne ce qui a effectivement été ajouté à la table 
    
     */
    @Override
    public AccesBack creer(AccesBack obj) {
        AccesBack access = new AccesBack();

        if (this.bddmanager.connect()) {
            try {
                String query = "INSERT INTO access_backoffice VALUES (?, ?, MD5(?))";
                PreparedStatement stInsert = this.bddmanager.getConnectionManager().prepareStatement(query);
                stInsert.setLong(1, obj.getUser_ID());
                stInsert.setString(2, obj.getNickname());
                stInsert.setString(3, obj.getPassword());

                System.out.println(stInsert.toString());

                stInsert.executeUpdate();

                access = this.find(obj.getUser_ID());

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return access;

        }
        return access;
    }

    /* 
    
    Cette méthode prend en argument l'obj a supprimer de la table 
    (créé avec le constructeur contenant uniquement la clef primaire)
    Elle retourne un boolean si la suppression a été effectué ou non
        
     */
    @Override
    public boolean supprimer(Long id) {
        Long userID = id;
        if (this.bddmanager.connect()) {

            try {
                String querySuppr = " DELETE FROM access_backoffice WHERE user_id = ?";
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(querySuppr);

                stSuppr.setLong(1, userID);

                System.out.println(stSuppr.toString());

                stSuppr.executeUpdate();

                succed = true;

            } catch (SQLException ex) {
                ex.printStackTrace();

                return succed;
            }

        }

        return succed;
    }

    @Override
    public ArrayList<AccesBack> getAll() {
        ArrayList<AccesBack> accessList = new ArrayList<>();
        if (this.bddmanager.connect()) {
            try {

                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM access_backoffice";
                ResultSet rs = st.executeQuery(requete);

                while (rs.next()) {

                    AccesBack RaR = new AccesBack(rs.getLong("user_id"), rs.getString("nickname"), rs.getString("password"));
                    accessList.add(RaR);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return accessList;
            }

        }
        return accessList;
    }

    @Override
    public AccesBack find(Long user_id) {
        AccesBack access = new AccesBack();

        if (this.bddmanager.connect()) {
            try {
                String requete = "SELECT * FROM access_backoffice WHERE user_id = ?";

                PreparedStatement stFind = this.bddmanager.getConnectionManager().prepareStatement(requete);

                stFind.setLong(1, user_id);

                ResultSet rs = stFind.executeQuery();
                if (rs.next()) {
                    access = new AccesBack(rs.getLong("user_id"), rs.getString("nickname"), rs.getString("password"));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }
        return access;
    }

    @Override
    public AccesBack update(Long id, AccesBack obj) {
        AccesBack access = obj;

        if (this.bddmanager.connect()) {
            try {
                String query = " UPDATE access_backoffice SET user_id =? , nickname =?, password = MD5(?) where user_id=?";
                PreparedStatement stUpdate = this.bddmanager.getConnectionManager().prepareStatement(query);
                stUpdate.setLong(1, access.getUser_ID());
                stUpdate.setString(2, access.getNickname());
                stUpdate.setString(3, access.getPassword());
                stUpdate.setLong(4, id);
                System.out.println(stUpdate.toString());

                stUpdate.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return this.find(id);

        }
        return this.find(id);
    }

}
