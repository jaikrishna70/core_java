package com.tns.Abstract;

public class square extends shape{
private float side;

	
	public void Square() {
		super();
		side=2.0f;
	}


	public float Square(float side) {
		super();
		this.side = side;
	}


	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}


	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	

}
