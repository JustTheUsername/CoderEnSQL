/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import bddsql.ConnectionBDD;

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

        ConnectionBDD test = ConnectionBDD.getInstance();

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
}
