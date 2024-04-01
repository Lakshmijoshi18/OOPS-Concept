package edu.atria.oops.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		Rbi bOne = new Sbi();
		System.out.println(bOne.getRI());
		
		Rbi bTwo = new Icici();
		System.out.println(bTwo.getRI());
		
		Rbi bTree = new Rbi();
		System.out.println(bTree.getRI());
	}

}
//It enables you to define a method in a child class with the same signature as a method in its parent class.
//The method that is called is determined by the JVM at runtime based on the type of object being referred to (dynamic binding).