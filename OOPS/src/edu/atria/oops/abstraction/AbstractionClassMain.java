package edu.atria.oops.abstraction;

public class AbstractionClassMain {

	public static void main(String[] args) {
	//	Shape s = new Shape(2.0f); 
		//we cannot instantiate abstract Shape class coz its Abstract//
		
		//Dynamic Binding is calling parent on left and creating object on right//
		Shape s = new Square(2.0f);
		s.calculateArea();
		s.display();
		
		Shape sTwo = new Rectangle(3.9f, 6.7f);
		sTwo.calculateArea();
		sTwo.display();
	}

}
