package edu.atria.oops.polymorphism;

public class OverLoadingDemo {

	public static void main(String[] args) {
		System.out.println(".........Method OverLoading.......");
		System.out.println("Addition of 2 integer:" + MethodOverloading.add(10, 20));
		System.out.println("Addition of 2 float:" + MethodOverloading.add(10.0f,20.0f));
		System.out.println("Addition of 2 string:" + MethodOverloading.add("10","20"));
		System.out.println("Addition of integer and float:" + MethodOverloading.add(10,20.5f));
		System.out.println("Addition of float and integer:" + MethodOverloading.add(10.9f, 20));
		
	}

}
//Compile-time Polymorphism (Method Overloading):
//Method overloading allows a class to have multiple methods with the same name, but with different parameters.