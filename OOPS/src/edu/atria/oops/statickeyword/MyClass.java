package edu.atria.oops.statickeyword;

public class MyClass {
	private int section; //non static or instance variable//
	private static int srNo; //static or class variable//
	
	
	//static block//
	//before running main method first when static block is created static block is loaded first//
	//when doing a connection between a database and eclipse(2 diff platforms) to store data 
	static {
		System.out.println("....within static block...");
		srNo = 1000;
	}
	
	
	//default constructor//
	MyClass(){
		System.out.println("Default Constructor");
		srNo++;
	}

	
	
	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo = "+srNo+"]";
	}
	
	
	static void display() {
		//cannot print(access) non static member from static member//
		//System.out.println(section);
		
		System.out.println(srNo);
	}
	
	
	
}
