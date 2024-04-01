package edu.atria.oops.inheritance;

public class Citizen {
	private long aadharNo;
	private String nationality;
	private String address;
	private String dob;
	private char gender;
	
	//constructor//
	public Citizen(long aadharNo, String nationality, String address, String dob, char gender) {
		/*super();*/
		this.aadharNo = aadharNo;
		this.nationality = nationality;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}
	
	//getters and setters//
	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//toString//
	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", nationality=" + nationality + ", address=" + address + ", dob="
				+ dob + ", gender=" + gender + "]";
	}	

}
