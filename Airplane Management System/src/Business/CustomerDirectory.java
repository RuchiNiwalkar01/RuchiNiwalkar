/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author riya
 */
public class CustomerDirectory 
{
    private ArrayList<Customer> customers;
    Seat seat;

    public CustomerDirectory() 
    {
        this.customers = new ArrayList<>();
        seat = new Seat();
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

   

    
    public ArrayList<Customer> getCustomers() 
    {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers)
    {
        this.customers = customers;
    }
    
    public Customer addCustomer()
    {
        Customer cust = new Customer();
        customers.add(cust);
        return cust;
    }
    
}
