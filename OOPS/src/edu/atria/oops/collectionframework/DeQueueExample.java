package edu.atria.oops.collectionframework;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueExample {

	public static void main(String[] args) {
		
	//always while creating object it is important to name it by the imported class name
	//object name and imported class name must match--
	Deque<Integer> dq = new LinkedList<>();	
	dq.add(5);
	dq.add(15);
	dq.add(35);
	
	dq.addFirst(10);
	dq.addLast(2);
	System.out.println(dq);
		
    System.out.println("First content is:" +dq.getFirst());
    System.out.println("First content is:" +dq.getLast());
	}

}
