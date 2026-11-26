package exceptionhandling;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {45,50,20,30};
		System.out.println(a[0]);
		try {
			System.out.println(a[4]);//if error was  done  in this line   and  will not execute next  line	
		
	 //   catch(expection,c){
		//System.out.println(c.getMessage());
		}
		
	catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
	 
		System.out.println(a[2]);
		
		}
		
	}
}
