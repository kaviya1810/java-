package day4;

public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 5;
		 
		switch (day) {
		    case 1:
		        System.out.println("Monday");
		        break;//future condition no need to check if  condition is  true 
		    case 2:
		        System.out.println("Tuesday");
		        break;
		case 3:
		        System.out.println("wednesday");
		        break;
		 
		case 4:
		        System.out.println("Thursday");
		        break;
		 
		case 5:
		        System.out.println("friday");
		        break;
		 
		    default:
		        System.out.println("Invalid day");
		}

	}

}
