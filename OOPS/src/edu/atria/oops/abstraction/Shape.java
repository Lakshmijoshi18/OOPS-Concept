package edu.atria.oops.abstraction;

public abstract class Shape {
	//static float area;//
	
	float area;
	
	//if we have atleast one abstract method then the class must be made as abstract class//
	//An abstract class can have both abstract and non abstract method//
	//sub class which extends abstract base class should implement all the abstract methods meaning
	//(the implementation must be written in the child class)//

	//create abstract method//
	public abstract float calculateArea();
	
	//abstract method can also have non abstract method (concrete method)//
	//an abstract class can have static and final methods methods//
	/* public static final void display() {
		System.out.println("print area of shape" + area);
		
	}*/
	
	public void display() {
		System.out.println("Area of shape" + area);
	}

}
