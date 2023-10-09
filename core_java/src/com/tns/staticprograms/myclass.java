package com.tns.staticprograms;

public class myclass {
	private int section; // instance variable
	private static int srNo;
	
	static {
		System.out.println("------- static block------");
		srNo=1000;
	}
	
	//  default constructor
	myclass(){
		System.out.println("------- default constuctor------");
		srNo++;
		section++;
		
	}
 static void display() {
	 //System.out.println("Section"+section);
	 System.out.println("serialNo:"+srNo);
    	 
     }


	@Override
	public String toString() {
		return "myclass [section=" + section + "]";
	}
	
    
}
