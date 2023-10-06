package com.tns.inheritance;
public class car {
private String companyName;


 public car() {
	super();
}

// parameterised constructor
public car(String companyName) {
	super();
	this.companyName = companyName;
}


// set getters and setters
public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
// to string  function
@Override
public String toString() {
	return "car [companyName=" + companyName + "]";
}
}
