package day6;

public class Stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concat() - join string
	String s1="welcome";
	String s2="to java";
	String s3="programming";
		
		System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
		
		
	System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("welcome"+"to java");
		System.out.println("welcome".concat("to java"));
		
		//charAt() - returns a character based on index
				// index starts from 0
				
				String s="welcome";
				
				System.out.println(s.charAt(6));   //c
				System.out.println(s.charAt(5));  //m
				
				//contains() - returns true/false
				//check a string is part of the main string
				
				System.out.println(s.contains("wel"));  //true
				System.out.println(s.contains("Come")); //false
				System.out.println(s.contains("come")); //true
				
				System.out.println(s.contains("welome")); //false
		 
		
 

	}

}
