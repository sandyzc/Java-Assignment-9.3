package com.collection.assignment3;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		//Employee codes
		EmpCode one = new EmpCode(1);
		EmpCode two = new EmpCode(2);
		EmpCode three = new EmpCode(3);
		EmpCode four = new EmpCode(4);
		EmpCode five = new EmpCode(5);
		
		//employee names
		EmpName empone = new EmpName("Rajesh");
		EmpName emptwo = new EmpName("ashwath");
		EmpName empthree = new EmpName("raju");
		EmpName empfour = new EmpName("naveen");
		EmpName empfive = new EmpName("santosh");
		
		
		HashMap<EmpCode,EmpName> map = new HashMap<EmpCode,EmpName>();
		
		// putting the values
		map.put(one, empone);
		map.put(two, emptwo);
		map.put(three, empthree);
		map.put(four, empfour);
		map.put(five, empfive);
		
		
		
		System.out.println(map.values());

	}

}
