package com.uni.modehausgruen;


import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.github.javafaker.Faker;

import Controller.CustomerController;
import model.*;


public class App 
{
	
    public static void main( String[] args )
    {
    	//fakes user data,
    	Faker faker = new Faker();
    	CustomerList customers = new CustomerList();
    	CustomerController customerController = new CustomerController();
    	
    	System.out.println("_________________________________________");
    	System.out.println("----------GENERATING CUSTOMERS!----------");
    	System.out.println("_________________________________________");
    	System.out.println("");
    	
    	
    	//generate 20 fake customers.
    	for(int i=0; i<20; i++) {
    		Customer customer = new Customer();
    		customer.setFirstname(faker.name().firstName());
        	customer.setLastname(faker.name().lastName());
        	customer.setSales(faker.number().randomDouble(2, 10, 2200));
        	customer.setStreet(faker.address().streetAddress());
        	
        	
        	//print our generated customer to console.
        	System.out.println("#" + (i+1) +  " " + customer);
        	
        	//add customer to our customersList.
        	customers.add(customer);
    	}
    	
    	    	
    	System.out.println("_________________________________________");
    	System.out.println("GETING CUSTOMERS WITH HIGHEST SALES!");
    	System.out.println("_________________________________________");
    	
    	//sort all customers in descending order from
    	customerController.sortCustomersBySalesDesc(customers);
    	
    	//calculate the customers CouponWorth
    	CustomerList customersWithHighestSalesAndCoupnWorth = customerController.getCustomersCouponWorth(customers);
    	
    	//print our customers in descending order with coupon worth
    	for(Customer customer: customersWithHighestSalesAndCoupnWorth) {
    		System.out.println(customer);
    	}
    	
    }
}
