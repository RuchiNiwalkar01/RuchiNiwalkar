/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class AirlineDirectory 
{
    private ArrayList<Airliners> airlineDirectory;
    
    //constructor
      public AirlineDirectory() 
      {
        this.airlineDirectory = new ArrayList<>();
      }
    
    //getters setters arraylist
    public ArrayList<Airliners> getAirlineDirectory() 
    {
        return airlineDirectory;
    }

    public void setAirlineDirectory(ArrayList<Airliners> airlineDirectory)
    {
        this.airlineDirectory = airlineDirectory;
    }
    
    //add Airlines
      public Airliners addAirline()
      {
         Airliners airliners = new Airliners();
         airlineDirectory.add(airliners);
         return airliners;
      }
    //remove Airline
        public void removeAirliner(Airliners a)
        {
            airlineDirectory.remove(a);
        }
      
      public ArrayList<Airliners> searchAirLines(String airlineName)
      {
           ArrayList<Airliners> arrayList=new ArrayList<>();
                     for(Airliners airliner: airlineDirectory)
                     {
                         if(airliner.getAirlineName().equalsIgnoreCase(airlineName))
                         {
                             arrayList.add(airliner);
                         }
                     }
          return arrayList ;
        }
    
    
}
