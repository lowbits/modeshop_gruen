package Controller;

import java.util.Collections;
import java.util.Comparator;

import model.Customer;
import model.CustomerList;

public class CustomerController {
	
	public void sortCustomersBySalesDesc(CustomerList customers) {
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer customer1, Customer customer2) {
				return customer2.getSales().compareTo(customer1.getSales());
			}
	    });
	}
	
	public CustomerList getCustomersCouponWorth(CustomerList customers) {
		CustomerList highestCustomersWithCouponWorth = new CustomerList();
		int couponWorth;
		Customer customer;
		
		
		//first 10 customers
		for(int i = 0; i < 10; i++) {
			customer = customers.get(i);
			couponWorth = (int) (customer.getSales() * 0.1);
			customer.setCouponWorth(couponWorth);
			highestCustomersWithCouponWorth.add(customer);
		}
		
		//all others
		for (int i = 9; i<customers.size(); i++) {
			customer = customers.get(i);
			double sales = customer.getSales();
			
			if(sales >= 2000) {
				couponWorth = (int) (sales * 0.05);
				customer.setCouponWorth(couponWorth);
				highestCustomersWithCouponWorth.add(customer);
			}else if(sales >= 1000) {
				couponWorth = (int) (sales * 0.03);
				customer.setCouponWorth(couponWorth);
				highestCustomersWithCouponWorth.add(customer);
			}else if(sales >= 333) {
				couponWorth = (int) (sales * 0.02);
				customer.setCouponWorth(couponWorth);
				highestCustomersWithCouponWorth.add(customer);
			}
		}
		
		return highestCustomersWithCouponWorth;
	}
	
}
