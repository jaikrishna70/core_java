 package com.tns.Abstract;

public class rectangle extends shape {
	private float width,height;

	@Override
	public String toString1() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}



		public void Rectangle() {
		super();
		this.width=4.5f;
		this.height=5.6f;
		
	}



		public void Rectangle(float width, float height) {
			super();
			this.width = width;
			this.height = height;
		}



		@Override
		void calArea() {
			// TODO Auto-generated method stud
		super.area=width*height;	
		}
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}

	}

}
