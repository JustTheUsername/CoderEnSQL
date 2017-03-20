/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.AccessSite;
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
public class AccessSiteDAOTest {
    
    public AccessSiteDAOTest() {
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
     * Test of creer method, of class AccessSiteDAO.
     */
    @Test
    public void testCreer() {
       
        
        AccessSite obj = new AccessSite(34L,"Paul","Paul");
        
        AccessSiteDAO instance = new AccessSiteDAO();
        
        instance.supprimer(34L);
        
        AccessSite result = instance.creer(obj);
        
        String expectedResult = "AccessSite{user_ID=34, nickname=Paul, password=c13e13da2073260c2194c15d782e86a9}";
        String resultat = result.toString();
        
        System.out.println(expectedResult);
        
        assertEquals(expectedResult, resultat);

        instance.supprimer(obj.getUser_ID());
    }

    /**
     * Test of supprimer method, of class AccessSiteDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        
        Long id = 34L;
      
        AccessSiteDAO instance = new AccessSiteDAO();
        
        AccessSite role_right = new AccessSite(id,"Paul","Paul");
        instance.creer(role_right);
        
        
        boolean expResult = true;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);}

    /**
     * Test of getAll method, of class AccessSiteDAO.
     */
    @Test
        public void testGetAll() {
        System.out.println("getAll");
     String result = "";
     String expResult = "";
     AccessSiteDAO instance = new AccessSiteDAO();
     ArrayList<AccessSite> arrayOfResult = instance.getAll();
        for (AccessSite access : arrayOfResult) {
            result += access;
            
        }
        expResult="AccessSite{user_ID=97, nickname=carlabruni, password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3}AccessSite{user_ID=96, nickname=root, password=dc76e9f0c0006e8f919e0c515c66dbba3982f785}";

     System.out.println(arrayOfResult);
     System.out.println(expResult);
     assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class AccessSiteDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = 34L;
        //on créé ici l'objet à chercher
        AccessSite access = new AccessSite(id,"Paul","Paul");
        
        AccessSiteDAO instance = new AccessSiteDAO();
        instance.supprimer(id);
        instance.creer(access);
        
        
        String expResult = "AccessSite{user_ID=34, nickname=Paul, password=c13e13da2073260c2194c15d782e86a9}";
        AccessSite result = instance.find(id);
        
        String resultat = result.toString();
        
        assertEquals(expResult, resultat);
    //ici on supprime l'objet créé
        instance.supprimer(34L);
    }

    /**
     * Test of update method, of class AccessSiteDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = 34L;
        
        AccessSiteDAO instance = new AccessSiteDAO();
        
        AccessSite acces = new AccessSite(id,"Paul","Paul");
        instance.creer(acces);
        
        
        AccessSite accesUpdates = new AccessSite(id,"Martin","Martin");
                
        
       
        AccessSite result = instance.update(id, accesUpdates);
        AccessSite expResult = instance.find(id);
        assertEquals(expResult, result);
    }
    
}
