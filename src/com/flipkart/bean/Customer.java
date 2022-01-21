/**
 * 
 */
package com.flipkart.bean;

/**
 * @author venkat.karthik
 *
 */
public class Customer {
	private int customerId;
	private String customerName;
	private String customerAdress;
	/**
	 * @return the customerId;
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	/**
	 * @return the customerName;
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * @return the customerAdress;
	 */
	public String getCustomerAdress() {
		return customerAdress;
	}
	/**
	 * @param customerAdress the customerAdress to set
	 */
	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}
}
