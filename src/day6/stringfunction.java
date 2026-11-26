package day6;

public class stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=" welcome  you  all ";
		
		System.out.println(s);
//lenght() - returns length of the string
		
		
		int l=s.length();
	System.out.println(l);  //7
	System.out.println(s.length()); //7
	
	//trim() - remove spaces right right and left side
	System.out.println("Before trimming:"+ s.length()); 
			String s1=s.trim();
			System.out.println("After trimming:"+s1.length()); 
			System.out.println(s.trim());
			
	}
	

}
