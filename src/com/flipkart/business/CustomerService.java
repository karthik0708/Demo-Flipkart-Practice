/**
 * 
 */
package com.flipkart.business;

import java.util.ArrayList;

import com.flipkart.bean.Customer;

/**
 * @author venkat.karthik
 *
 */
public class CustomerService {
	//the service class implementing all the operations for creaating, updating and deleting the customers
	ArrayList<Customer> myCustomers = new ArrayList<Customer>();
	
	public void createCustomer(String customerName, String customerAdress) {
		Customer newCustomer = new Customer();
		newCustomer.setCustomerId(101+myCustomers.size());
		newCustomer.setCustomerName(customerName);
		newCustomer.setCustomerAdress(customerAdress);
		myCustomers.add(newCustomer);
		System.out.println("Customer is created");
	}
	
	public void updateCustomer(String customerName, String newName, String newAdress) {
		for(Customer customer: myCustomers) {
			if(customer.getCustomerName().equals(customerName)) {
				if(!newName.equals("skip")) {
					customer.setCustomerName(newName);
				}
				if(!newName.equals("skip")) {
					customer.setCustomerAdress(newAdress);
				}
			}
		}
		System.out.println("Customer is updated");
	}
	
	public void listCustomer() {
		for(Customer customer: myCustomers) {
			System.out.println("Customer Id is:" + customer.getCustomerId() + "\n" + "Customer Name:" + customer.getCustomerName());
			System.out.println();
		}
	}
	
	public void deleteCustomer(String customerName) {
		myCustomers.removeIf(customer -> customer.getCustomerName().equals(customerName));
		System.out.println("Customer is deleted");
	}
}
