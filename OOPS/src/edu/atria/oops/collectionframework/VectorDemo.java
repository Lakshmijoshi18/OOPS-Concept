package edu.atria.oops.collectionframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> number = new Vector<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
        
		//calculate the size
		System.out.println("The size of vector :" +number.size());
		
		//printing value
		System.out.println("The numbers are:" +number);
		
		//for each loop
		for(Integer value:number) {
			System.out.println(value);
		}
		
		number.add(2,80);
		System.out.println(number);
	}
	

}
