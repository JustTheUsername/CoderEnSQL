/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

/**
 *
 * @author Formation
 */
public class Booking {
    
    private long bookingId;
    private long userId;
    private long flightId;
    private short seat;
    
    public Booking(){};

    public Booking(long bookingId, long userId, long flightId, short seat) {
       
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.seat = seat;
        
    }

    public Booking(long userId, long flightId, short seat) {
        this.userId = userId;
        this.flightId = flightId;
        this.seat = seat;
    }
    

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public short getSeat() {
        return seat;
    }

    public void setSeat(short seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", seat=" + seat + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.bookingId ^ (this.bookingId >>> 32));
        hash = 67 * hash + (int) (this.userId ^ (this.userId >>> 32));
        hash = 67 * hash + (int) (this.flightId ^ (this.flightId >>> 32));
        hash = 67 * hash + this.seat;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Booking other = (Booking) obj;
        if (this.bookingId != other.bookingId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (this.flightId != other.flightId) {
            return false;
        }
        if (this.seat != other.seat) {
            return false;
        }
        return true;
    }
    
    
}
