package edu.atria.oops.finalkeyword;

final class FinalClass{
	void show() {
		System.out.println("Final class canntot be inherited");
	}
}


//You cannot do inheritance to a final class ie; cant create child class for Final class 
//Eg: String, Wrapper class, System
/*class FinalChidClass extends FinalClass{
	
} */


//Note:
//Final class cannot be inherited but object can be created//

public class FinalClassDemo {

	public static void main(String[] args) {
		FinalClass f1 = new FinalClass();
		f1.show();

	}

}
