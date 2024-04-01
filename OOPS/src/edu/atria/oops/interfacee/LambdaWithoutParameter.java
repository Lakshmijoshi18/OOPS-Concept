package edu.atria.oops.interfacee;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
	Statement s = () -> {return "hello";};
	System.out.println(s.greet());
	
	isOdd i = (a) -> a % 2 == 0 ? true : false;
	System.out.println(i.CheckOdd(5));
	}

}
