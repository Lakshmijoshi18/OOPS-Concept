package edu.atria.oops.statickeyword;

public class EmployeeStatic {
	private String name;
	private int id;
	
	//static variable is common for all emaplyees as it acts as a global variable with same memory
	private static String companyName="IBM";

	
	//in constructors it wont have static variable since it can be accessed anywhere//
	public EmployeeStatic(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	
	//getters//
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public static String getCompanyName() {
		return companyName;
	}



	@Override
	public String toString() {
		return "EmployeeStatic [name=" + name + ", id=" + id + ", companyName = "+companyName+"]";
	}
	
	
	
	

}
