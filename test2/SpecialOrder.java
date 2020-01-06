package com.bus.oops;

public class SpecialOrder extends Orders {
	
	public SpecialOrder(int custId, String custName, int orderId, String orderName, int orderQuantity) {
		super(custId, custName, orderId, orderName, orderQuantity);
	}

	public void dispatch() {
		System.out.println("Dispatched Earlier");
}

	@Override
	public void receive() {
	}

	
}