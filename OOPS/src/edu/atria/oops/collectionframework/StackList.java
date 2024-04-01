package edu.atria.oops.collectionframework;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println("Pushing elements into stack:");
		s.push(1);
		s.push(2);
		s.push(5);
		s.push(9);
		s.push(51);
		s.push(0);
		System.out.println("Elements in stack are:" +s);
		
		//Removing last element by using pop
		System.out.println("Removing last element from stack:" +s.pop());
		System.out.println(s);
		
		
		//Removing elements by giving index number
		 s.remove(3);
	     System.out.println("Removing element in index 3 is:" +s);
		
		
		//Searching elements it returns distance of that element from "top of stack"
		System.out.println("Searching element:" +s.search(51));
		System.out.println("Searching element:" +s.search(88));
		System.out.println("Searching element:" +s.search(9));
		System.out.println("Searching element:" +s.search(5));
		
		System.out.println("Peek shows the top of element in stack and it is:" +s.peek());
		System.out.println(s);
		
		
		//Removing elements by giving index number
		System.out.println("Removing element by giving index is:" +	 s.remove(3));
		System.out.println(s);
	    
	}

}
