/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.RolesAndRights;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dao.RolesAndRightsDAO;
/**
 *
 * @author Formation
 */
public class RolesAndRightsDAOTest {
    
    public RolesAndRightsDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of creer method, of class RolesAndRightsDAO.
     */
    @Test
    public void testCreer() {
        System.out.println("creer");

        
        RolesAndRights obj = new RolesAndRights(34L,true,true);
        
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        
        instance.supprimer(34L);
        RolesAndRights expResult = obj;
        RolesAndRights result = instance.creer(obj);
        

        String expectedResult = expResult.toString();
        String resultat = result.toString();
        
        System.out.println(expectedResult);
        
        assertEquals(expectedResult, resultat);

        instance.supprimer(obj.getUser_ID());
    }

    /**
     * Test of supprimer method, of class RolesAndRightsDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        
        Long id = 34L;
      
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        
        RolesAndRights role_right = new RolesAndRights(id,true,true);
        instance.creer(role_right);
        
        
        boolean expResult = true;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class RolesAndRightsDAO.
     */
    @Test
    public void testGetAll() {
     System.out.println("getAll");
     String result = "";
     String expResult = "";
     RolesAndRightsDAO instance = new RolesAndRightsDAO();
     ArrayList<RolesAndRights> arrayOfResult = instance.getAll();
        for (RolesAndRights rar : arrayOfResult) {
            result += rar;
            
        }
        expResult="RolesAndRights{user_ID=96, admin=true, blocked=false}RolesAndRights{user_ID=97, admin=false, blocked=false}";

     System.out.println(arrayOfResult);
     System.out.println(expResult);
     assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class RolesAndRightsDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
       
        Long id = 34L;
        //on créé ici l'objet à chercher
        RolesAndRights role_right = new RolesAndRights(id,true,true);
        
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        instance.supprimer(id);
        instance.creer(role_right);
        
        
        String expResult = "RolesAndRights{user_ID=34, admin=true, blocked=true}";
        RolesAndRights result = instance.find(id);
        
        String resultat = result.toString();
        
        assertEquals(expResult, resultat);
    //ici on supprime l'objet créé
        instance.supprimer(34L);
    }

    /**
     * Test of update method, of class RolesAndRightsDAO.
     */
    @Test
    public void testUpdate() {
        Long id = 34L;
        
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        
        RolesAndRights role_right = new RolesAndRights(id,true,true);
        instance.creer(role_right);
        
        
        RolesAndRights role_rightUpdates = new RolesAndRights(id,false,false);
                
        
        RolesAndRights expResult = role_rightUpdates;
        RolesAndRights result = instance.update(id, role_rightUpdates);
        assertEquals(expResult, result);
    }
    
}
