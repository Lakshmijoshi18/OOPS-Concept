package edu.atria.oops.classandobject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details");
		String name = sc.next();
		int id = sc.nextInt();
		String dept = sc.next();
		float salary = sc.nextFloat();
		
		
		//if we create void displaydetails //
		/* eOne.displaydetails(); */
		
		//calling defult constructor//
		/*Employee eOne = new Employee();
		System.out.println(eOne);*/
		
		//calling parametrised constructor//
	  //  Employee eTwo = new Employee(name, id, dept, salary);
	//	System.out.println(eTwo); 
		
		//or instead of giving parameters user setters like it//
		Employee eOne = new Employee();
		eOne.setName(name);
		eOne.setId(id);
		eOne.setDept(dept);
		eOne.setSalary(salary);
		System.out.println(eOne);
		
	}

}
