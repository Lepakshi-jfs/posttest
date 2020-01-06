package com.bus.oops;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static List OrderList = new ArrayList<Customer>();
	public static void main(String[] args) {
		
	
			
		
		Customer c1=new Customer(5,"Lepakshi");
		System.out.println(c1);
		
		Orders order1 = new SpecialOrder(23, "laptop", 5, "laptop", 0);
		System.out.println(order1);
		Customer c2=new Customer(6,"Geetha");
		
		addCustomer(c2);
		updateCustomer(c2);
		findCustomer(c2);
		deleteCustomer(c2);
	}
		
		
		private static void addCustomer(Customer c2) 
		{
			
				OrderList.add(c2);
				System.out.println("Added Successfully");
			
			}
		private static void updateCustomer(Customer c2) {
			OrderList.set(0, c2);
			System.out.println("Updation Added Successfully");
			System.out.println(c2);
			}

         private static void findCustomer(Customer c2) {
        	 boolean bool=OrderList.contains(c2);
				if(bool) {
				System.out.println("FoundCustomer");
				}
				else {
				System.out.println("Customer not found!");
				}
        	 
         }
         
         private static void deleteCustomer(Customer c2) {
        	 System.out.println(OrderList.remove(c2));
         }
		
		
		
	}