/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.util.Objects;

/**
 *
 * @author Formation
 */
public class Airport {

    private String code_AITA;
    private String city;
    private String country;

    public Airport(String code_AITA, String city, String country) {

        this.code_AITA = code_AITA;
        this.city = city;
        this.country = country;

    }
       
    public Airport() {
        
    }
    
    public Airport(String code_AITA){
    
        this.code_AITA=code_AITA;
 
    }

    public String getCode_AITA() {
        return code_AITA;
    }

    public void setCode_AITA(String code_AITA) {
        this.code_AITA = code_AITA;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.code_AITA);
        hash = 41 * hash + Objects.hashCode(this.city);
        hash = 41 * hash + Objects.hashCode(this.country);
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
        final Airport other = (Airport) obj;
        if (!Objects.equals(this.code_AITA, other.code_AITA)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Airport{" + "code_AITA=" + code_AITA + ", city=" + city + ", country=" + country + '}';
    }
    
    
}
