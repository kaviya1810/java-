package day3;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  var= exp ? result1 : result 2
		
				//Example1
				int a=100, b=200;
				int res1=(a>b)?a:b;
				System.out.println(res1);
				//(400<200)?400:200;
				   //false?200;
			//(100>200)?100:200;
				//false:200;
				//Example2
				int person_age=15;
				
				String res=(person_age>=18)? "Eligible": "Not eligible";
				
				System.out.println(res);

	}

}
