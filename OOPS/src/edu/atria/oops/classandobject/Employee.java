package edu.atria.oops.classandobject;


//data is encapsulated// // these are private field or instance variable//
public class Employee {
	private String name;
	private int id;
	private String dept;
	private float salary;
	
	//create default constructor//
	public Employee() {
		System.out.println("Default constructor is called..");
	}
	
	//create parametrised constructor//
	public Employee(String name, int id, String dept,float salary ) {
		System.out.println("parametrised constructor is called..");
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	//getter and setter used since we have encapsulated//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	//display details//
	/*public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
	                OR*/
	//create "toString" method to represent obj as string to display details//
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
