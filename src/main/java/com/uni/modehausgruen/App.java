package com.uni.modehausgruen;


import com.uni.modehausgruen.model.*;

public class App 
{
    public static void main( String[] args )
    {
    	Customer customer = new Customer();
    	customer.setFirstname("Tobias");
    	customer.setStreet("Otto-Joschko Str. 15");
    	
    	
        System.out.println( customer.toString());
    }
}
