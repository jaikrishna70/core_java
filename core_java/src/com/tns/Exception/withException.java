package com.tns.Exception;

import java.util.InputMismatchException;

// program to demonistrate try and catch blocks
public class withException {
	public static void divide() {
		int a=6,b=0,c;
		try { // exception is raised
		c=a/b;
		}
		//catch(ArithmeticException e) {  // exception is handled and e is an object
		//	System.out.println("Exception Caught" +e.getMessage());
		//}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught" +e.getMessage());
			
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Caught" +e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception Caught" +e.getMessage());
		}
		finally {
			System.out.println("This will be executed");
		}
		
		
	}

	
		

	}


