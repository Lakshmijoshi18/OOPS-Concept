package edu.atria.oops.collectionframework;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	
	Node head, tail;
	public void insert(int data) {
		Node n = new Node(data);
		n.next = null;
		
		if (head == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
		
}


public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.display();
	}

}
