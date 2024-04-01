package edu.atria.oops.collectionframework;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(4);
		que.offer(51);
		que.add(3);
		que.offer(2);
		
		System.out.println("Queue content is :" +que);
		//que.clear(); no such element exception 
		
		System.out.println("Queue content using remove is:" +que.remove());//remove head and return it
		System.out.println("Queue updated content is :" +que);
		
		System.out.println("Queue peek content is :" +que.peek());//just returns head without removing
		
		//que.clear(); by clearing contents when poll is used NULL value is given coz values are not there
		System.out.println("Queue poll content is :" +que.poll());//eliminate head value and return it
		System.out.println("Queue updated  content is :" +que);
		
		System.out.println("Queue element content is :" +que.element());//same as peek
		

	}

}
