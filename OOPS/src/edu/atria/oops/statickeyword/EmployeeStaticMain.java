package edu.atria.oops.statickeyword;

public class EmployeeStaticMain {

	public static void main(String[] args) {
		System.out.println(EmployeeStatic.getCompanyName());
		
		EmployeeStatic e = new EmployeeStatic("Tom", 51);
        System.out.println(e);
        
        EmployeeStatic eTwo = new EmployeeStatic("Marry", 66);
        System.out.println(eTwo);
	}

}
