package edu.atria.oops.abstraction;

public class Square extends Shape {
	float side;
	
	

	public Square(float side) {
		super();//dint get field of Shape in it coz we have not created constructor for Shape//
		this.side = side;
	}



	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area = side * side;
	}
	

}
