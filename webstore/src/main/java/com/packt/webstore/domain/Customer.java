package com.packt.webstore.domain;

public class Customer {
	private String customerId;
	private String name;
	private String adress;
	private boolean noOfOrdersMade;
	
	public Customer(String customerId, String name, String adress, boolean oOfOrdersMade) {
		this.customerId = customerId;
		this.name = name;
		this.adress = adress;
		this.noOfOrdersMade = oOfOrdersMade;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public boolean isNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(boolean noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

}
