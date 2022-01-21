/**
 * 
 */
package com.flipkart.application;

import java.util.Scanner;

import com.flipkart.business.CustomerService;

/**
 * @author venkat.karthik
 *
 */
public class customerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create instance of customer service
		CustomerService service = new CustomerService();
		
		System.out.println("new - for new customer");
		System.out.println("update - for updating");
		System.out.println("del - delete customer");
		System.out.println("list - list all customers");
		System.out.println("quit - exit the session");
		System.out.println("Session has started.............");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String command = scanner.nextLine();
			
			if(command.equals("quit")) {
				System.out.println("Exiting session..........");
				break;
			}
			
			System.out.println("Enter Name: ");
			
			String name = scanner.nextLine();
			
			switch(command) {
			case "new":
				
				System.out.println("Enter Address: ");
				String adress = scanner.nextLine();

				service.createCustomer(name, adress);
				break;
				
			case "update":

				System.out.println("Enter changed name or enter skip");
				String newName = scanner.nextLine();

				System.out.println("Enter changed adress or enter skip");
				String newAdress = scanner.nextLine();

				service.updateCustomer(name, newName, newAdress);
				break;
				
			case "del":
				
				service.deleteCustomer(name);
				break;
				
			case "list":
				
				if(name.equals("admin")) {
					service.listCustomer();
				}
				break;
				
			default:
				System.out.println("Invalid command");
			}
			System.out.println();
		}
		
	}

}
