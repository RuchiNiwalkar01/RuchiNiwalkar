/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class Seat 
{
     String[] seatsSelection = {"Left-Aisle-1", "Left-Aisle-2", "Left-Aisle-3", "Left-Aisle-4", "Left-Aisle-5", "Left-Middle-1", "Left-Middle-2", "Left-Middle-3", "Left-Middle-4", "Left-Middle-5", "Left-Middle-6" };
     //String[] middleSeatLeft  = {"Left-Middle-1", "Left-Middle-2", "Left-Middle-3", "Left-Middle-4", "Left-Middle-5", "Left-Middle-6"};
//     String[] windowSeatLeft = {"LW-1", "LW-2", "LW-3", "LW-4", "LW-5", "LW-6"};
//     String[] aisleSeatRight = {"RA-1", "RA-2", "RA-3", "RA-4", "RA-5", "RA-6"};
//     String[] middleSeatRight = {"RM-1", "RM-2", "RM-3", "RM-4", "RM-5", "RM-6"};
//     String[] windowSeatRight = {"RW-1", "RW-2", "RW-3", "RW-4", "RW-5", "RW-6"};
     ArrayList<String> seatsSelection1 = new ArrayList<>();
     
     
    public Seat(){
        seatsSelection1.add("Left-Aisle-1");
        seatsSelection1.add("Left-Aisle-2");
        seatsSelection1.add("Left-Aisle-3");
        seatsSelection1.add("Left-Aisle-4");seatsSelection1.add("Left-Aisle-5");
        seatsSelection1.add("Left-Aisle-6");
        
        
        
    }
    //getter METHODS

    public String[] getSeatsSelection() {
        return seatsSelection;
    }

    @Override
    public String toString() {
        return "Seat{" + "seatsSelection=" + seatsSelection + '}';
    }
     
public void removeSeat(String seatno)
{

    seatsSelection1.remove(seatno);
    
}

    public ArrayList<String> getSeatsSelection1() {
        return seatsSelection1;
    }

    public void setSeatsSelection1(ArrayList<String> seatsSelection1) {
        this.seatsSelection1 = seatsSelection1;
    }

  
}
