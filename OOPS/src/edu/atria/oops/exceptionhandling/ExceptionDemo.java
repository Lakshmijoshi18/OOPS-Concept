package edu.atria.oops.exceptionhandling;

public class ExceptionDemo {
	public void Demo() throws Exception {
		int c = 5/0;
		System.out.println(c);
	}
	
	public void slave() {
		try {
			Demo();
		}
		catch (Exception e) {
			System.out.println("Exception----->" +e);
		}
	}
	

	public static void main(String[] args) {
		ExceptionDemo obj = new ExceptionDemo();
		obj.slave();
		

	}

}
