package edu.atria.oops.secondpackage;
import edu.atria.oops.firstpackage.*;

public class Executor extends Base {

	public static void main(String[] args) {
		Base bOne = new Base();//base class is in first package so import the first package
        Executor ex = new Executor();
        System.out.println(ex.varProtected);
        System.out.println(ex.varPublic);    //public is accessible everywhere

	}

}
