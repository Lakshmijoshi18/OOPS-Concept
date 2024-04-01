package edu.atria.oops.interfacee;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display {
	static void show(String s) {
		System.out.println("***" + s + "****");
	}
	
}


public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		//CONSUMER BY USING REFERENCING FUNCTION ---accept()
		Consumer<String> consumer = Display::show;//(method referencing) since its static method we use class name
		System.out.println("It is Consumer function");
		consumer.accept("Amit"); //comsumer has only 1 method ie; "Accept"
		
		
		//SUPPLIER BY USING LAMBDA FUNCTION ---get()
		Supplier<String> supplier = () -> "Hello from supplier!!";
		System.out.println("It is Supplier function");
		consumer.accept(supplier.get());//for get() method we have to use accept() method
		//since supplier has only 1 method get() first we need to supply or give any value so we use lambda to give that value
		
		
		//PREDICATE METHOD ---test()
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println("It is Predicate function");
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-25));
		
		
		//BI FUNCTION 
		         //ip1      ip2      op
		BiFunction<Integer, Integer, Integer> bifunc = (x, y) -> x > y ? x : y;
		System.out.println("It is BiFunction");
		System.out.println(bifunc.apply(25, 14));
		System.out.println((bifunc.apply(14, 99)));
		        // ip1     ip2      op
		BiFunction<String, Integer, String> bifu = (name, num) -> name + num;
		System.out.println(bifu.apply("Ram " , 51));
		
		//if we give <integer string integer>0-[[ its not possiable because string cannot be converted to integer
		BiFunction<Integer, String, String> bifuu = (num, name) -> num + name;
		System.out.println(bifuu.apply(51, " Sam "));
  
	}

}
