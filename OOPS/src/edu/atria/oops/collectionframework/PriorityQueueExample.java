package edu.atria.oops.collectionframework;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> prq = new PriorityQueue<>();
		prq.add(10);
		prq.offer(6);
		prq.add(3);
		prq.offer(7);
		System.out.println(prq);
		
		System.out.println("Queue content using remove is:" +prq.remove());//remove head and return it
		System.out.println("Queue updated content is :" +prq);
		
		System.out.println("Queue peek content is :" +prq.peek());//just returns head without removing
		
		//que.clear(); by clearing contents when poll is used NULL value is given coz values are not there
		System.out.println("Queue poll content is :" +prq.poll());//eliminate head value and return it
		System.out.println("Queue updated  content is :" +prq);
		
		System.out.println("Queue element content is :" +prq.element());//same as peek


	}

}
