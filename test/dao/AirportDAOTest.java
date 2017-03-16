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
        
        System.out.println(expectedResult);
        
        assertEquals(expectedResult, resultat);

    }

        /**
     * Test of find method, of class AirportDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String id = "KKK";
        AirportDAO instance = new AirportDAO();
        String expResult = "Airport{code_AITA=KKK, city=Machin Lake, country=USA}";
        Airport result = instance.find(id);
        
        String resultat = result.toString();
        
        assertEquals(expResult, resultat);

    }

    /**
     * Test of supprimer method, of class AirportDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        String id = "KKK";
        AirportDAO instance = new AirportDAO();
        boolean expResult = true;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of update method, of class AirportDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String id = "KKK";
        Airport obj = new Airport("KKK","Truck Lake","USA");
        AirportDAO instance = new AirportDAO();
        Airport expResult = obj;
        Airport result = instance.update(id, obj);
        assertEquals(expResult, result);

    }

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



    
}
