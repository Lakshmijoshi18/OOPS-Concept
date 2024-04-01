package edu.atria.oops.multithreading;

class Bye implements Runnable{
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

//method in runnable is run()
class Byee implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) 
		System.out.println("Hello");
		try{
			Thread.sleep(500);
		}
		catch(Exception e) {
	}

	}
}	
	
	public class Runn {

		public static void main(String[] args) {
			Bye obj = new Bye();
			Byee obj2 = new Byee();
			Thread obj3 = new Thread(obj);
			obj3.start();
			try {
				Thread.sleep(300);
			}
			catch(Exception e) {
			
		}
		Thread obj4 = new Thread(obj2);
		obj4.start();
		
		obj3.setPriority(Thread.NORM_PRIORITY);
		//System.out.println("Good");
		System.out.println(obj3.getPriority());
		}
		
	}
//keyword used to prevent multiple thread from accessing accessing a method simultaneously is "Synchronized"
	
