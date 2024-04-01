package edu.atria.oops.inheritance;

public class Mp extends Citizen {
	private int mpId;
	private String mpName;
	private String locality;
	private String party;
	
	public Mp(long aadharNo, String nationality, String address, String dob, char gender, int mpId, String mpName, String locality, String party) {
		super(aadharNo, nationality, address, dob, gender);
		this.mpId = mpId;
		this.mpName = mpName;
		this.locality = locality;
		this.party = party;
		
	}

	
	public int getMpId() {
		return mpId;
	}

	public void setMpId(int mpId) {
		this.mpId = mpId;
	}

	public String getMpName() {
		return mpName;
	}

	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}


	
	@Override
	public String toString() {
		return "Mp [mpId=" + mpId + ", mpName=" + mpName + ", locality=" + locality + ", party=" + party
				+ ", getAadharNo()=" + getAadharNo() + ", getNationality()=" + getNationality() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getGender()=" + getGender() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	
	

}
