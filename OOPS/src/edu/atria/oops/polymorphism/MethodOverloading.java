package edu.atria.oops.polymorphism;

public class MethodOverloading {
	
	//example for compile time polymorphism//
	//since we have used static we wont create an object//
	//static method can be overloaded//
	public static int add(int a, int b) {
		return a+b;	
	}
	
	public static float add(float a, float b) {
		return a +b;
	}
	
	public static String add(String a, String b) {
		return a + b;
	}
	
	public static float add(int a, float b) {
		return a +b;
	}
	
	public static float add(float a, int b) {
		return a + b;
	}


}
