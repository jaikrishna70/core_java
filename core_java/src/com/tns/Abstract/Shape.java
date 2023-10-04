package com.tns.Abstract;
// program to demonistrate abstract in java
// abstract class
public abstract class Shape {
	protected float area;
	// abstract method
	abstract void calArea();
	void show() {
		// concrete method
		System.out.println("area of shape is "+area);
		
	}
	

}
