package edu.atria.oops.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		
		//Hetrogenous data is given
		set.add(1);
		set.add(2.88f);
		set.add("Atria");
		set.add(true);
		set.add('F');
		//insertion order is not same so it wont use index 
		System.out.println("elements in set are:" +set);
		
		
		//duplicates are not allowed
		set.add(true);
		System.out.println("Duplicate element is not repeated again" +set);
		
		//IMPORTANT RULE
		//Hash Set - no duplicate element, and no insertion order is maintained.
		//LinkedHash Set - no duplicate element, and insertion order is maintained
		
	}

}
