package edu.atria.oops.firstpackage;

public class Base {
	//declaring  default ,public,private and protected variables by using respective modifiers

    

    int varDefault = 10;

    public int varPublic= 20;

    private int varPrivate=30;

    protected int varProtected =40;

   

    // a getter is created here for protected member to access this member in second package

    public int getvarProtected() {

           return varProtected;

    }

   

    //declare methods with default ,public,private,protected types

    void methodDefault() {

           System.out.println("Default access Base class");

           System.out.println("Default variable:"+varDefault);

    }

}
