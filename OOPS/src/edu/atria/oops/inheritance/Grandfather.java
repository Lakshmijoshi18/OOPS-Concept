package edu.atria.oops.inheritance;

public class Grandfather {
	private String name;
	private int age;
	
	
	public Grandfather(String name, int age) {
		this.name = name;
		this.age = age;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Grandfather [name=" + name + ", age=" + age + "]";
	}

}
