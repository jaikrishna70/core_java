package com.tns.inheritance;

public class S5Sportback extends audi{
	private long maxspeed;
	// default constructor
	public S5Sportback() {
		super();
	}
	// parameterised constructor

	public S5Sportback(long maxspeed) {
		super();
		this.maxspeed = maxspeed;
	}


	// set getters and setters

	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	

	public S5Sportback(String modelName) {
		super(modelName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S5Sportback [maxspeed=" + maxspeed + "]";
	}

	

	
	}

