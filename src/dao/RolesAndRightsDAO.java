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

    /*
     cette méthode ajoutera un objet de type airport à la bdd 
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

    @Override
    public boolean supprimer(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RolesAndRights> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolesAndRights find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolesAndRights update(Long id, RolesAndRights obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
