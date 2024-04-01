package edu.atria.oops.collectionframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> treeset = new TreeSet();
		
		//IMPORTANT RULE 
		//In set interface only Tree Set accepts only "HOMOGENOUS DATA" but other class in set accept HETROGENOUS DATA.
		/*treeset.add(true);
		treeset.add(3.56f);
		add("Atria");
		treeset.add('M'); */ //all are hetrogenous
		
		
		//duplicate elements not allowed and insertion is not in order.
		//elements are sorted and set
		treeset.add(111);
		treeset.add(2);
		treeset.add(34);
		treeset.add(41);
		treeset.add(5);
		System.out.println("elements in treeset are: " +treeset);
		
		
		
		//user defined TreeSet
		TreeSet<Student> t = new TreeSet<Student>();
		t.add(new Student("Rahul", 101,  98.5f));
		t.add(new Student("Ramam", 102,  100.0f));
		t.add(new Student("Ritika", 103,  87.0f));
		t.add(new Student("Rohit", 104,  90.5f));
		t.add(new Student("Rishi", 105,  92.0f));
		System.out.println("Student details are:" +t);
		
	}

}
