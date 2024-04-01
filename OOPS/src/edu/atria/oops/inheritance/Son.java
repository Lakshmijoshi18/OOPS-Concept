package edu.atria.oops.inheritance;

public class Son extends Father {
	private String sklName;
	private String color;
	
	
	public Son(String name, int age, String company, int height, String sklName, String color) {
		super(name, age, company, height);
		this.sklName = sklName;
		this.color = color;
		
	}

	
	public String getSklName() {
		return sklName;
	}

	public void setSklName(String sklName) {
		this.sklName = sklName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "Son [sklName=" + sklName + ", color=" + color + ", getCompany()=" + getCompany() + ", getHeight()="
				+ getHeight() + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
