package edu.atria.oops.exceptionhandling;

public class ExcptionHandling {

	public static void main(String[] args) {
		
		try {
			int a = 5/1;
			System.out.println(a);
			
			
			//array will execute and if there is error tn only it will show//
			try {
				int arr[] = {2};
				arr[10] = 25;
				throw new Exception();
			}
		
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception---->"+e);
			} 
		}
		catch(Exception a) {
			System.out.println("Exception" +a);
		}
	}

}
