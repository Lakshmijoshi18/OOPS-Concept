package edu.atria.oops.interfacee;

//only 1 method must be there in functional interface

@FunctionalInterface
public interface Statement {
	
	public String greet();
	//public int caculate(); Functional interface has only one method
	
}

