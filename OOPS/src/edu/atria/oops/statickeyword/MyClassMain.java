package edu.atria.oops.statickeyword;

public class MyClassMain {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj);
		
		MyClass.display();
		
		MyClass objT = new MyClass();
		MyClass.display();
	

	}

}
