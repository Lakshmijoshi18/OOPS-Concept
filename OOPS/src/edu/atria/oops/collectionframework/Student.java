package edu.atria.oops.collectionframework;

public class Student implements Comparable<Student> {
	private String name;
	private int rollno;
	private float per;
	
	
	public Student(String name, int rollno, float per) {
		this.name = name;
		this.rollno = rollno;
		this.per = per;
	}
	
	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", per=" + per + "]";
	}

	

	@Override
	public int compareTo(Student anotherStudent) {
		if(this.per == anotherStudent.per)
			return 0; //compare to accepts integer so return type is 0
		
		else if(this.per > anotherStudent.per)
			return 1;
		
		else
			return -1;
		
	}	

}
//Comparable has natural ordering meaning ordering is done in alphabetical order or numerical order
//Comaprable is functional interface means has only one method ie; compareTo() method