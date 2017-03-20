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
        RolesAndRights role_right = null;
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        RolesAndRights expResult = null;
        RolesAndRights result = instance.creer(role_right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class RolesAndRightsDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        Long id = null;
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        boolean expResult = false;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class RolesAndRightsDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        ArrayList<RolesAndRights> expResult = null;
        ArrayList<RolesAndRights> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class RolesAndRightsDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long user_id = null;
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        RolesAndRights expResult = null;
        RolesAndRights result = instance.find(user_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RolesAndRightsDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = null;
        RolesAndRights obj = null;
        RolesAndRightsDAO instance = new RolesAndRightsDAO();
        RolesAndRights expResult = null;
        RolesAndRights result = instance.update(id, obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
