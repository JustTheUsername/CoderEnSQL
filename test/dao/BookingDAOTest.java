/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Booking;
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
public class BookingDAOTest {
    
    public BookingDAOTest() {
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
     * Test of creer method, of class BookingDAO.
     */
    @Test
    public void testCreer() {
        short place = 27;
        System.out.println("creer");
        
        Booking obj = new Booking(34L,5L,place);
        
        BookingDAO instance = new BookingDAO();
                
        
        
        Booking result = instance.creer(obj);
        
        Booking expResult = instance.find(result.getBookingId());
        
        System.out.println(result);
        
        assertEquals(expResult, result);

        instance.supprimer(result.getBookingId());
    }

    /**
     * Test of supprimer method, of class BookingDAO.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        
        Long id = 34L;
        short place = 27;
         
        BookingDAO instance = new BookingDAO();
        boolean expResult = true;
        
        Booking obj = new Booking(34L,34L,5L,place);
        instance.creer(obj);
        
        boolean result = instance.supprimer(obj.getBookingId());
        assertEquals(expResult, result);

    }

    /**
     * Test of getAll method, of class BookingDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        String result = "";
        String expResult = "";
        BookingDAO instance = new BookingDAO();
        ArrayList<Booking> arrayOfResult = instance.getAll();
        for (Booking booking : arrayOfResult) {
            result += booking;

        }
        expResult = "Booking{bookingId=1, userId=10, flightId=1, seat=1}Booking{bookingId=2, userId=13, flightId=1, seat=2}Booking{bookingId=3, userId=16, flightId=1, seat=3}Booking{bookingId=4, userId=19, flightId=1, seat=4}Booking{bookingId=5, userId=22, flightId=1, seat=5}Booking{bookingId=6, userId=25, flightId=1, seat=6}Booking{bookingId=7, userId=28, flightId=1, seat=7}Booking{bookingId=8, userId=31, flightId=1, seat=8}Booking{bookingId=10, userId=37, flightId=1, seat=10}Booking{bookingId=11, userId=40, flightId=1, seat=11}Booking{bookingId=12, userId=43, flightId=1, seat=12}Booking{bookingId=13, userId=46, flightId=1, seat=13}Booking{bookingId=14, userId=49, flightId=1, seat=14}Booking{bookingId=15, userId=52, flightId=1, seat=15}Booking{bookingId=16, userId=55, flightId=1, seat=16}Booking{bookingId=17, userId=58, flightId=1, seat=17}Booking{bookingId=18, userId=61, flightId=1, seat=18}Booking{bookingId=19, userId=64, flightId=1, seat=19}Booking{bookingId=20, userId=67, flightId=1, seat=20}Booking{bookingId=21, userId=70, flightId=1, seat=21}Booking{bookingId=22, userId=73, flightId=1, seat=22}Booking{bookingId=23, userId=76, flightId=1, seat=23}Booking{bookingId=24, userId=79, flightId=1, seat=24}Booking{bookingId=25, userId=82, flightId=1, seat=25}Booking{bookingId=26, userId=85, flightId=1, seat=26}Booking{bookingId=27, userId=88, flightId=1, seat=27}Booking{bookingId=28, userId=91, flightId=1, seat=28}Booking{bookingId=29, userId=94, flightId=1, seat=29}";
        System.out.println(arrayOfResult);
        System.out.println(expResult);
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class BookingDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long booking_id = 1L;
        
        BookingDAO instance = new BookingDAO();
        
        String expResult = "Booking{bookingId=1, userId=10, flightId=1, seat=1}";
        String result = instance.find(booking_id).toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of update method, of class BookingDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = 34L;
        short place =27;
        BookingDAO instance = new BookingDAO();

        Booking booking = new Booking(34L,34L,5L,place);
        instance.creer(booking);

        Booking bookingUpdates = new Booking(37L,34L,5L,place);

        Booking result = instance.update(id, bookingUpdates);
        Booking expResult = instance.find(id);
        assertEquals(expResult, result);
    }
    
}
