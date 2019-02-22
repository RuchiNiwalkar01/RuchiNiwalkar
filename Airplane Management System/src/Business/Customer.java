/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Customer 
{
    private String customerName;
    private int customerPhoneNum;
    private static int count =150;
    private int customerCount;

    public static int getCount() {
        return count;
    }

    public int getCustomerCount() {
        return customerCount;
    }
    //getter setters
    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public int getCustomerPhoneNum() 
    {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(int customerPhoneNum)
    {
        this.customerPhoneNum = customerPhoneNum;
    }
       
    
    //constructor

    public Customer() 
    {
        
        customerCount = count;
       
    }
    public int countSeatdecrement()
    {
        count --;
        customerCount = count;
        return customerCount;
    }

    @Override
    public String toString() 
    {
        return customerCount+"";
    }
    
    
}
