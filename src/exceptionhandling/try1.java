package exceptionhandling;

public class try1 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s=null;
	
	try
	{
	System.out.println(s.length());                                                                                                                                                                                                                                                        
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception handled...");
	}
	catch(NullPointerException e)
	{
		System.out.println("null pointer exception handled...");
	}
	finally
	{
		System.out.println("entered into finally block......");
	}
	
}
}
