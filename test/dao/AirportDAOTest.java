/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
        Object obj = null;
        AirportDAO instance = new AirportDAO();
        Object expResult = false;
   //     Object result = instance.creer(obj);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class AirportDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        Object obj = null;
        AirportDAO instance = new AirportDAO();
        boolean expResult = false;
   //     boolean result = instance.supprimer(obj);
   //     assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AirportDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AirportDAO instance = new AirportDAO();
        ArrayList expResult = null;
        ArrayList result = instance.getAll();
        
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AirportDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String objShearch = "DXB";
        AirportDAO instance = new AirportDAO();
        Object expResult = null;
        Object result = instance.find(objShearch);
       
        
        String resultFind=result.toString();
        String expecteddResult="Airport{" + "code_AITA=" + "DXB" + ", city=" + "Dubaï" + ", country=" + "Émirats arabes unis" + '}';
        
        assertEquals(expecteddResult, resultFind);
        
        
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AirportDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object obj = null;
        AirportDAO instance = new AirportDAO();
        Object expResult = null;
  //      Object result = instance.update(obj);
   //     assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
