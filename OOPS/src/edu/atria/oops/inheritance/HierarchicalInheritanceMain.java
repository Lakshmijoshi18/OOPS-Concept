package edu.atria.oops.inheritance;

public class HierarchicalInheritanceMain {

	public static void main(String[] args) {
		Mp m = new Mp(456346364L, "Indian", "Bangalore", "01-08-2002", 'F', 101, "Tom", "Rajajinagar", "BJP");
		System.out.println(m);
		
		//even in place of Mp if we put Citizen output will come coz of data binding(loose coupling)
		/* Citizen m = new Mp(456346364L, "Indian", "Bangalore", "01-08-2002", 'F', 101, "Tom", "Rajajinagar", "BJP");
		  Sytem.out.println(m); */
		 
		
		Student s = new Student(456346364L, "Indian", "Bangalore", "01-08-2002", 'F',51, "Laksh", "CSE");
		System.out.println(s);
		
		//even in place of Student if we put Citizen we get op//
		/* Citizen s = new Student(456346364L, "Indian", "Bangalore", "01-08-2002", 'F',51, "Laksh", "CSE");
		  Sytem.out.println(s); */

	}

}
