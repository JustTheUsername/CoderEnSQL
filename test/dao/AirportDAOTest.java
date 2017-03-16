/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Airport;
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
public class AirportDAOTest {
    
    public AirportDAOTest() {
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
     * Test of creer method, of class AirportDAO.
     */
    @Test
    public void testCreer() {
        System.out.println("creer");
        Airport obj = new Airport("KKK","Machin Lake","USA");
        
        AirportDAO instance = new AirportDAO();
        

        Airport expResult = obj;
        Airport result = instance.creer(obj);
        

        String expectedResult = expResult.toString();
        String resultat = result.toString();
        
        assertEquals(expectedResult, resultat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of supprimer method, of class AirportDAO.
//     */
//    @Test
//    public void testSupprimer() {
//        System.out.println("supprimer");
//        String obj = "";
//        AirportDAO instance = new AirportDAO();
//        boolean expResult = false;
//        boolean result = instance.supprimer(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAll method, of class AirportDAO.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        AirportDAO instance = new AirportDAO();
//        ArrayList expResult = null;
//        ArrayList result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class AirportDAO.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        String id = "";
//        Airport obj = null;
//        AirportDAO instance = new AirportDAO();
//        Airport expResult = null;
//        Airport result = instance.update(id, obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of find method, of class AirportDAO.
     */
//    @Test
//    public void testFind() {
//        System.out.println("find");
//        String id = "";
//        AirportDAO instance = new AirportDAO();
//        Airport expResult = null;
//        Airport result = instance.find(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
