package edu.atria.oops.exceptionhandling;

//program to demonstrate exception or user defined exception


public class InvalidAgeException extends Exception{
	//for any  =exception Exception is parent class but for Exception Throwable is parent class
	
	//constructor
	//public InvalidAgeException() {
	//	super("Invalid age");
	//}
	
	//parametrised constructor
	public InvalidAgeException(String message) {
		super(message);
	}
	

}
