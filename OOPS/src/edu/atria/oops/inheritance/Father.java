package edu.atria.oops.inheritance;

public class Father extends Grandfather {
	private String company;
	private int height;
	
	
	public Father(String name, int age, String company, int height) {
		super(name, age);
		this.company = company;
		this.height = height;
		
	}

	

	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Father [company=" + company + ", height=" + height + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
