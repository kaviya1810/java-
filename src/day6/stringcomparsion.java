package day6;

public class stringcomparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equals() , equalsIgnoreCase()  - compare 2 strings
				// returns true/false
				
				String s1="welcome";
			 String s2="Welcome";
				
				System.out.println(s1.equals(s2)); // true
				System.out.println(s1.equals("welcome"));  //false
				
				System.out.println(s1.equalsIgnoreCase("Welcome"));  //true
				//replace() - replace single character/sequence of characters(string) in a string
				
				String s="welcome to selenium java python python";
				
				System.out.println(s.replace('e','X')); //wXlcomX to sXlXnium java python python
				System.out.println(s.replace("python","C#")); //welcome to selenium java C# C#
				
				
				//substring() - extract substring from the main string
				
				String c="welcome";
				
				System.out.println(c.substring(2, 5)); //lco
				System.out.println(c.substring(1,3)); //el	
				
				//toUpperCase()   toLowerCase() - coverting case
				String x="Welcome";
					
					System.out.println(x.toUpperCase()); //WELCOME  // convert to upper case
					System.out.println(x.toLowerCase()); //welcome // convert to lower case
		 

	}

}
