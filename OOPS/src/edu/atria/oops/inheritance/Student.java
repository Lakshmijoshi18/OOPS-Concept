package edu.atria.oops.inheritance;

public class Student extends Citizen{
	private int id;
	private String name;
	private String dept;
	
	//constructor that extends parent class and for child class//
	public Student(long aadharNo, String nationality, String address, String dob, char gender, int id, String name, String dept) {
		super(aadharNo, nationality, address, dob, gender);
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
    
	//getters and setters//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
    
	//toString//
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", getAadharNo()=" + getAadharNo()
				+ ", getNationality()=" + getNationality() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
				+ ", getGender()=" + getGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
