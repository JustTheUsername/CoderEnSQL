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

        AccessSite obj = new AccessSite(34L, "Paul", "Paul");

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

        AccessSite role_right = new AccessSite(id, "Paul", "Paul");
        instance.creer(role_right);

        boolean expResult = true;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);
    }

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
        expResult = "AccessSite{user_ID=20, nickname=accumsan, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=39, nickname=amet, password=8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e}AccessSite{user_ID=52, nickname=Anderson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=43, nickname=Burke, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=79, nickname=Burkeke, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=63, nickname=Butler, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=93, nickname=Chapman, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=32, nickname=condimentum, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=47, nickname=Cook, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=42, nickname=Dean, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=35, nickname=diam, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=44, nickname=Diaz, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=6, nickname=dolor, password=30c85ffbd1cbc9018986de8669bb43f997e4b541}AccessSite{user_ID=13, nickname=duis, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=74, nickname=Dunn, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=11, nickname=eget, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=36, nickname=elementum, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=41, nickname=erat, password=8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e}AccessSite{user_ID=16, nickname=est, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=7, nickname=etiam, password=30c85ffbd1cbc9018986de8669bb43f997e4b541}AccessSite{user_ID=73, nickname=Ferguson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=92, nickname=Fields, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=58, nickname=Fuller, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=48, nickname=Gardner, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=45, nickname=Gibson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=95, nickname=Gilbert, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=90, nickname=Gomez, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=82, nickname=Graham, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=50, nickname=Gray, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=86, nickname=Greene, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=18, nickname=habitasse, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=23, nickname=hac, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=81, nickname=Hamilton, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=46, nickname=Harvey, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=85, nickname=Hawkins, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=70, nickname=Holmes, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=68, nickname=Hughes, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=26, nickname=iaculis, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=29, nickname=ipsum, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=75, nickname=Jones, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=17, nickname=justo, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=87, nickname=Lawson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=83, nickname=LeBeauFerguson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=9, nickname=leo, password=30c85ffbd1cbc9018986de8669bb43f997e4b541}AccessSite{user_ID=65, nickname=Matthews, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=12, nickname=mauris, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=64, nickname=Mcdonald, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=56, nickname=mdrdu23, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=54, nickname=Medina, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=89, nickname=Mendoza, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=24, nickname=metus, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=33, nickname=morbi, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=94, nickname=Nelson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=28, nickname=non, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=19, nickname=nunc, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=31, nickname=odio, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=67, nickname=Oliver, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=38, nickname=ololol, password=8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e}AccessSite{user_ID=53, nickname=Olson, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=80, nickname=Palmer, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=14, nickname=pellentesque, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=78, nickname=Porter, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=62, nickname=Powell, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=61, nickname=Price, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=22, nickname=primis, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=30, nickname=proin, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=27, nickname=purus, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=72, nickname=Reid, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=88, nickname=Reynolds, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=10, nickname=rhoncus, password=30c85ffbd1cbc9018986de8669bb43f997e4b541}AccessSite{user_ID=71, nickname=RichardOlOl, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=60, nickname=Roberts, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=77, nickname=Rose, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=69, nickname=Ruiz, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=21, nickname=semper, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=57, nickname=Shaw, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=51, nickname=Smith, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=8, nickname=tellus, password=30c85ffbd1cbc9018986de8669bb43f997e4b541}AccessSite{user_ID=66, nickname=Thomas, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=37, nickname=tincidunt, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=49, nickname=Torres, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=25, nickname=tristique, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=40, nickname=ultrices, password=8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e}AccessSite{user_ID=15, nickname=vestibulum, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}AccessSite{user_ID=76, nickname=Washington, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=91, nickname=Wells, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=55, nickname=Willis, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=59, nickname=Wood, password=714099846d5fca096f50c162b6d1bdc1378c12ec}AccessSite{user_ID=84, nickname=Woods, password=714099846d5fca096f50c162b6d1bdc1378c12ec}";
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
        AccessSite access = new AccessSite(id, "Paul", "Paul");

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

        AccessSite acces = new AccessSite(id, "Paul", "Paul");
        instance.creer(acces);

        AccessSite accesUpdates = new AccessSite(id, "Martin", "Martin");

        AccessSite result = instance.update(id, accesUpdates);
        AccessSite expResult = instance.find(id);
        assertEquals(expResult, result);
    }

}
