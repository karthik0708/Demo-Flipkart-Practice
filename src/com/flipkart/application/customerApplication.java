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
		
		System.out.println("1 - for new customer");
		System.out.println("2 - for updating");
		System.out.println("3 - delete customer");
		System.out.println("4 - list all customers");
		System.out.println("q - exit the session");
		System.out.println("Session has started.............");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String command = scanner.nextLine();
			
			if(command.equals("q")) {
				System.out.println("Exiting session..........");
				break;
			}
			
			System.out.println("Enter Name: ");
			
			String name = scanner.nextLine();
			
			switch(command) {
			case "1":
				
				System.out.println("Enter Address: ");
				String adress = scanner.nextLine();

				service.createCustomer(name, adress);
				break;
				
			case "2":

				System.out.println("Enter changed name or enter skip");
				String newName = scanner.nextLine();

				System.out.println("Enter changed adress or enter skip");
				String newAdress = scanner.nextLine();

				service.updateCustomer(name, newName, newAdress);
				break;
				
			case "3":
				
				service.deleteCustomer(name);
				break;
				
			case "4":
				
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
