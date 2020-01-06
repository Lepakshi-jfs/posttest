package com.bus.oops;

public abstract class Orders extends Customer {
	int orderId;
	String orderName;
	int orderQuantity;

	public Orders(int custId, String custName, int orderId, String orderName, int orderQuantity) {
		super(custId, custName);
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
	}

	@Override
	public String toString() {
		return "Orders orderId=" + orderId + ", \n orderName=" + orderName + ",\n orderQuantity=" + orderQuantity ;
	}

	public void confirm(){
		System.out.println("Order selected");
	}
	public  void close(){
		System.out.println("Order placed");
	}
	public abstract void dispatch();
	public abstract void receive();
	
}