package com.tns.staticprograms;

public class EmployeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee ob=new employee("krishna",54);
		System.out.println(ob);
		employee companyName; // accessing the static variable
		ob = new employee("ashish",65);
		System.out.println(ob);

	}

}
