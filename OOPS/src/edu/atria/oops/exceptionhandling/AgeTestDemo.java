package edu.atria.oops.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {
	
	//make static coz u dont have to create object to call it
	//in method we use throws but in body we use throw
	//int age is put in () coz it accepts the int age value and tn it validates
	
	//throws is used in method to specify that the method might throw an exception so be prepared
	static void validate(int age) throws InvalidAgeException {
		
		if (age < 18) {
			//throw is used inside method body to actually throw error we r explictly specify
			throw new InvalidAgeException("Invalid age, not eligiable to vote");
		}
		
		else {
			System.out.println("Your eligiable to vote");
		}
	}
	
	
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		//call method to validate age
	try {
		validate(age);
	}
	catch(Exception i) {
		System.out.println("Exception caught..." +i.getMessage());//getmessage calls constructor
	}
	sc.close();		
		
	}
	
}
