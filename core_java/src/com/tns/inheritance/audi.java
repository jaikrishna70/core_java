package com.tns.inheritance;

public class audi extends car {
	private String modelName;
	//default constructor
	public audi() {
		super();
	}
// parameterised constructor
	public audi(String modelName) {
		super();
		this.modelName = modelName;
	}
	

	// set getters and setters
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}
	// to string  function
	@Override
	public String toString() {
		return "audi [modelName=" + modelName + "]";
	}




}
