/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.RolesAndRights;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class RolesAndRightsDAO extends DAO<RolesAndRights, Long> {

    boolean succed = false;
    
    public RolesAndRightsDAO(){
    
        super();
        
    }
    
    /*
    Cette méthode ajoutera un objet de type airport à la bdd 
    elle prend comme argument l'obj à inserrer dans la table
    et retourne ce qui a effectivement été ajouté à la table 
    
     */
    @Override
    public RolesAndRights creer(RolesAndRights role_right) {
        RolesAndRights role = new RolesAndRights();

        if (this.bddmanager.connect()) {
            try {
                String query = "INSERT INTO roles_rights VALUES (?, ?, ?)";
                PreparedStatement stInsert = this.bddmanager.getConnectionManager().prepareStatement(query);
                stInsert.setLong(1, role_right.getUser_ID());
                stInsert.setBoolean(2, role_right.isAdmin());
                stInsert.setBoolean(3, role_right.isBlocked());

                System.out.println(stInsert.toString());

                stInsert.executeUpdate();

                role = this.find(role_right.getUser_ID());

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return role;

        }
        return role;
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
                String querySuppr = " DELETE FROM roles_rights WHERE user_id = ?";
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
    public ArrayList<RolesAndRights> getAll() {
         ArrayList<RolesAndRights> rarList = new ArrayList<>();
        if (this.bddmanager.connect()) {
            try {

                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM roles_rights";
                ResultSet rs = st.executeQuery(requete);

                while (rs.next()) {

                    RolesAndRights RaR = new RolesAndRights(rs.getLong("user_id"), rs.getBoolean("admin"), rs.getBoolean("blocked"));
                    rarList.add(RaR);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return rarList;
            }

        }
        return rarList;}
/*
    
    Cette méthode retourne l'aéroport avec le code AITA donné en argument 
       
     */
    @Override
    public RolesAndRights find(Long user_id) {
        RolesAndRights rar = new RolesAndRights();

        if (this.bddmanager.connect()) {
            try {
                String requete = "SELECT * FROM roles_rights WHERE user_id = ?";

                PreparedStatement stFind = this.bddmanager.getConnectionManager().prepareStatement(requete);

                stFind.setLong(1, user_id);

                ResultSet rs = stFind.executeQuery();
                if(rs.next()) {
                   rar = new RolesAndRights(rs.getLong("user_id"), rs.getBoolean("admin"), rs.getBoolean("blocked"));
                }
                

            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }
        return rar;
    }
    /*
    
    Cette méthode prend en argument l'id de la ligne a changer et un objet de
    type aéroport qui est les modif à apporter 
    
     */
    
    @Override
    public RolesAndRights update(Long id, RolesAndRights obj) {
         RolesAndRights rar = obj;

        if (this.bddmanager.connect()) {
            try {
                String query = " UPDATE roles_rights SET user_id =? , admin =?, blocked =? where user_id=?";
                PreparedStatement stUpdate = this.bddmanager.getConnectionManager().prepareStatement(query);
                stUpdate.setLong(1, rar.getUser_ID());
                stUpdate.setBoolean(2, rar.isAdmin());
                stUpdate.setBoolean(3, rar.isBlocked());
                stUpdate.setLong(4, id);
                System.out.println(stUpdate.toString());

                stUpdate.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return rar;

        }
        return rar;}

}
