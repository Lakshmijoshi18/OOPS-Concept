package edu.atria.oops.multithreading;


class Hii extends Thread{
	public void run() {
		for(int i=0; i<5;i++) 
		System.out.println("Hiiiii");
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			
		}		
		
	}
}
	
class Hello extends Thread{
	public void run() {
		for(int i=0; i<5;i++) 
		System.out.println("Hello");
		try{
			Thread.sleep(500);
		}
		catch(Exception e) {
	}

	}


public class App {

	public static void main(String[] args) {
		Hii obj = new Hii();
		Hello obj2 = new Hello();
		obj.start();
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
		
	}
	obj2.start();
	}
	
}
}

	

