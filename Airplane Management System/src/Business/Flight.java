/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riya
 */
public class Flight 
{
    private ArrayList<Seat> seatArrayList;
    private static int modelNumber = 0;
    private String flightNumber;
    private String source;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;
    private double price;
    private int flightID;
  //  public static int  countOfSeats=150;
    private int count=150;
    public ArrayList<Seat> getSeatArrayList() {
        return seatArrayList;
    }

    public void setSeatArrayList(ArrayList<Seat> seatArrayList) {
        this.seatArrayList = seatArrayList;
    }
   
    
    
    //getters and setters
   

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getModelNumber() 
    {
        return modelNumber;
    }

    public int getFlightID() {
        return flightID;
    }

    public int getCount() {
        return count;
    }
    
    

    //Constructor
    public Flight()
    {
        this.seatArrayList = new ArrayList<>();
        modelNumber++;
      
        flightID  = modelNumber;
      
    }

    @Override
    public String toString() 
    {
        return flightID+"" ;
    }
    
    //add seats
//    public Seat addSeats()
//    {
//       // Seat seat = new Seat(1 , "W-L", "M-L" , "A-L" ,"W-R", "M-R" , "A-R"  );
//        Selectseat.add(seat);
//        return seat;         
//    }
//    
    
    
    public void decerement()
    {
        
        count = count--;  
    }
    
}
