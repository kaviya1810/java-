package day4;

public class statementNestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		boolean hasLicense = false;
		 
		if (age >= 18)//true {
		    if (hasLicense)//false {
		        System.out.println("You can drive.");
		    }

	}


