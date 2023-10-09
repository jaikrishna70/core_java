package com.tns.staticprograms;
// program to demonstrate static variable

public class employee {
	// instance variable
	private String name;
	private int id;
	
	// static variable
	static String companyName="Tns";
	
	
	public employee() {
		super();
	}
	// parametreized constructor
	public employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ",companyName=" + companyName + "]";
	}
	
	
	
	

}
