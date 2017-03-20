/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Booking;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class BookingDAO extends DAO <Booking,Long>{
boolean succed = false;
    @Override
    public Booking creer(Booking obj) {
        Booking booking = new Booking();
    
    if(this.bddmanager.connect()){
    
    
            try {
                
                String query =" INSERT INTO bookings (user_id,flight_id,place)VALUES(?,?,?) ";
                PreparedStatement stInsert = this.bddmanager.getConnectionManager().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                
                stInsert.setLong(1, obj.getUserId());
                stInsert.setLong(2, obj.getFlightId());
                stInsert.setShort(3, obj.getSeat());
                
                System.out.println(stInsert.toString());

               int rs = stInsert.executeUpdate();
                
                  if(rs !=0){
                    ResultSet id_increment = stInsert.getGeneratedKeys();
                    if(id_increment.next()){
                        booking.setBookingId(id_increment.getInt(1));
                    }
                }
                  
                booking = this.find(obj.getUserId());
            
            
            } catch (SQLException ex) {
                Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return booking;
    }
    
    return booking;
    }

    @Override
    public boolean supprimer(Long id) {
            Long userID = id;
        if (this.bddmanager.connect()) {

            try {
                String querySuppr = " DELETE FROM bookings WHERE user_id = ?";
                PreparedStatement stSuppr = this.bddmanager.getConnectionManager().prepareStatement(querySuppr);

                stSuppr.setLong(1, userID);

                System.out.println(stSuppr.toString());

                stSuppr.executeUpdate();

                succed = true;

            } catch (SQLException ex) {
                ex.printStackTrace();

                return succed;
            

        }}
    
    return succed;}

    @Override
    public ArrayList<Booking> getAll() {
        ArrayList<Booking> bookingList = new ArrayList<>();
        if (this.bddmanager.connect()) {
            try {

                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM bookings";
                ResultSet rs = st.executeQuery(requete);

                while (rs.next()) {

                    Booking booking = new Booking(rs.getLong("id"),rs.getLong("user_id"), rs.getLong("flight_id"), rs.getByte("place"));
                    bookingList.add(booking);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return bookingList;
            }

        }
        return bookingList;
    }

    @Override
    public Booking find(Long booking_id) {
            Booking booking = new Booking();

        if (this.bddmanager.connect()) {
            try {
                String requete = "SELECT * FROM bookings WHERE id = ?";

                PreparedStatement stFind = this.bddmanager.getConnectionManager().prepareStatement(requete);

                stFind.setLong(1, booking_id);

                ResultSet rs = stFind.executeQuery();
                if (rs.next()) {
                    booking = new Booking(rs.getLong("id"),rs.getLong("user_id"), rs.getLong("flight_id"), rs.getByte("place"));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }
        return booking;
    }

    @Override
    public Booking update(Long id, Booking obj) {
            Booking booking = obj;

        if (this.bddmanager.connect()) {
            try {
                String query = " UPDATE bookings SET user_id =? , flight_id =?, place = ? where id=?";
                PreparedStatement stUpdate = this.bddmanager.getConnectionManager().prepareStatement(query);
                stUpdate.setLong(1, booking.getUserId());
                stUpdate.setLong(2, booking.getFlightId());
                stUpdate.setShort(3, booking.getSeat());
                stUpdate.setLong(4, id);
                System.out.println(stUpdate.toString());

                stUpdate.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return this.find(id);

        }
        return this.find(id);
    }
    
}
