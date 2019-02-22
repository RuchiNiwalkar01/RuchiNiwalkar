/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class Airliners 
{
   private ArrayList<Flight> flightSchedule;
   private String airlineName;
    
     //constructor
    public Airliners()
    {
     flightSchedule = new ArrayList<>();
    }
    
  //getter setters

    public ArrayList<Flight> getFlightSchedule() 
    {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule)
    {
        this.flightSchedule = flightSchedule;
    }

    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

  
    //add Flights
     public Flight addFlight()
    {
      Flight f = new Flight();
      flightSchedule.add(f);
      return f;
    }
    
     public void removeProduct(Flight f) {
        flightSchedule.remove(f);
    }
    
    public Flight searchFlight(int id) 
    {
        for(Flight f : flightSchedule) {
            if(f.getFlightID()==id) {
                return f;
            }
        }
        return null;
    }
 
      @Override
    public String toString() {
        return airlineName;
    }
    
}
