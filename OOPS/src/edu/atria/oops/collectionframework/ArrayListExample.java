package edu.atria.oops.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//cannot instantiate list(means cannot create object)
		//List list = new List();
		
		//create elements
		List list = new ArrayList();
		list.add(0, 1);
		list.add(1, "Good");
		list.add(2, 'F');
		list.add(3, 98.9);
		list.add(4, 6463784572L);
		System.out.println(list);
		
		//retrive elements
		System.out.println("Element in 1st index:" +list.get(1));
		//System.out.println("Element in 7st index:" +list.get(7)); //exception is output
		System.out.println(list.contains("L"));
		System.out.println(list.size());
		
		//list also accepts duplicate values
		list.add(5, "Good");
		System.out.println(list);
		
		//list also accepts null value
		list.add(6, null);
		System.out.println(list);
		
		//clear collection
		list.clear();
		System.out.println(list);

	}

}
