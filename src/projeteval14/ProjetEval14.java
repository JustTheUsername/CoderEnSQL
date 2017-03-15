/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeteval14;
import dao.*;
import datasave.Airport;
import java.util.ArrayList;
/**
 *
 * @author Formation
 */
public class ProjetEval14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        AirportDAO apDAO = new AirportDAO();
        
        ArrayList<Airport> airportList = apDAO.getAll();
        
        System.out.println("il y a "+airportList.size()+" aeroports");
        
        System.out.println();
        for ( Airport ap : airportList){
        
            System.out.println("Code AITA : "+ ap.getCode_AITA() +" --> "+ ap.getCity()+" , "+ap.getCountry());
        }
        
    }
    
}
