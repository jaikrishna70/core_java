package com.tns.Exception;
 // program to demonistrate nested try block
public class nestedTry {
	public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("the length of string is "+ slength);
	String anotherstring="null";
	int s1=anotherstring.length();
	System.out.println("the length is "+s1);
	int y=6;
	try { // outer try
		int z=y/0; //exception occurs
		try { // inner try
			System.out.println(str.charAt(y)); // exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("IndexOutOfBounds exception" +ex.getMessage());
		}
		catch(NullPointerException ex) {
			System.out.println("NullPointer Exception" +ex.getMessage());
			
		}
	}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception" +ex.getMessage());
		}
	
	
		
	
	}
	

}
