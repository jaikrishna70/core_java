package com.tnsif.programs;

public class person {
		// TODO Auto-generated method stub
		private int income;
		private string name;
		private int tax; // getters and setters to protect the data
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public string getName() {
			return name;
		}
		public void setName(string name) {
			this.name = name;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}// help to print object in string format
		@Override
		public String toString() {
			return "person [income=" + income + ", tax=" + tax + "]";
		}

	}

