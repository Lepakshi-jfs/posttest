package com.bus.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(312);
		list.add("pranavi");
		list.add(313);
		list.add(312);
		list.add(0, "Ryakala");
		System.out.println( list.size());
		list.remove(new Integer(312));
		Iterator itr=list.listIterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			if(obj instanceof Integer)
			{
				System.out.println(itr.next());	
			}
		}

	}

}
