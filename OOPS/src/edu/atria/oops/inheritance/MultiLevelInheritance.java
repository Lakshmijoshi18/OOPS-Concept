package edu.atria.oops.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		//due to loose coupling instead of Son we can write Grandfather also//
		Grandfather s = new Son("Tom", 45, "IBM", 4,"vvs","white");
        System.out.println(s);
	}

}
