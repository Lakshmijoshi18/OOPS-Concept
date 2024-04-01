package edu.atria.oops.finalkeyword;

public class FinalVariable {
	
	
	//final int y;        final instance must be initilized
	final int x = 100; //initilize final variable
	
	
	//declare a final static blank variable
	final static int Y = 51;
	
	
	//instance method
	void change() {
	//	x = 30; // final variables cant be reassigned
	//	Y = 200; // final static variables cant be reassigned
	}
	
	
	public String tostring() {
		return "FinalVariable[x="+x+", Y = "+Y+"]";
	}
	
	
	//declare static block to initilize the final and final static variable
	static {
	//	Y = 25; //even in static block values cant be reassigned
	//	x = 100;//x is non static and it cannot be used in static and once initilized cant be reassigned//
		System.out.println("Value of Y" +Y);
		
	}
	

}
