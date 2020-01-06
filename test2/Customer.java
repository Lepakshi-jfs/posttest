package com.bus.oops;

public class Customer {
	int custId;
	String custName;
	public Customer(int custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer custId=" + custId + ", \n custName=" + custName ;
	}
	
}