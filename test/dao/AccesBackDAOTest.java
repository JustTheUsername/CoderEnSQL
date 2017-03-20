/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.AccesBack;
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
public class AccesBackDAOTest {
    
    public AccesBackDAOTest() {
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
     * Test of creer method, of class AccesBackDAO.
     */
    @Test
    public void testCreer() {
       
        
        AccesBack obj = new AccesBack(34L,"Paul","Paul");
        
        AccesBackDAO instance = new AccesBackDAO();
        
        instance.supprimer(34L);
        
        AccesBack result = instance.creer(obj);
        
        String expectedResult = "AccesBack{user_ID=34, nickname=Paul, password=c13e13da2073260c2194c15d782e86a9}";
        String resultat = result.toString();
        
        System.out.println(expectedResult);
        
        assertEquals(expectedResult, resultat);

        instance.supprimer(obj.getUser_ID());
    }

    /**
     * Test of supprimer method, of class AccesBackDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        
        Long id = 34L;
      
        AccesBackDAO instance = new AccesBackDAO();
        
        AccesBack role_right = new AccesBack(id,"Paul","Paul");
        instance.creer(role_right);
        
        
        boolean expResult = true;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);}

    /**
     * Test of getAll method, of class AccesBackDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
     String result = "";
     String expResult = "";
     AccesBackDAO instance = new AccesBackDAO();
     ArrayList<AccesBack> arrayOfResult = instance.getAll();
        for (AccesBack access : arrayOfResult) {
            result += access;
            
        }
        expResult="AccesBack{user_ID=97, nickname=carlabruni, password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3}AccesBack{user_ID=96, nickname=root, password=dc76e9f0c0006e8f919e0c515c66dbba3982f785}";

     System.out.println(arrayOfResult);
     System.out.println(expResult);
     assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class AccesBackDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = 34L;
        //on créé ici l'objet à chercher
        AccesBack access = new AccesBack(id,"Paul","Paul");
        
        AccesBackDAO instance = new AccesBackDAO();
        instance.supprimer(id);
        instance.creer(access);
        
        
        String expResult = "AccesBack{user_ID=34, nickname=Paul, password=c13e13da2073260c2194c15d782e86a9}";
        AccesBack result = instance.find(id);
        
        String resultat = result.toString();
        
        assertEquals(expResult, resultat);
    //ici on supprime l'objet créé
        instance.supprimer(34L);
    }

    /**
     * Test of update method, of class AccesBackDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = 34L;
        
        AccesBackDAO instance = new AccesBackDAO();
        
        AccesBack access = new AccesBack(id,"Paul","Paul");
        instance.creer(access);
        
        
        AccesBack accesUpdates = new AccesBack(id,"Martin","Martin");
                
        
       
        AccesBack result = instance.update(id, accesUpdates);
        AccesBack expResult = instance.find(id);
        assertEquals(expResult, result);
    }
    
}
