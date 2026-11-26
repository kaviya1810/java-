package day9;

public class localgobslconstructor {
	//global variable, local variable
	
		// declared below the class and above your method---global var
		//once declared it can be used 'n' of times
		
		
		//constructor----it is a special method in java
		
		// it is used to initialize the object
		// 3 rules for creating a constructor
		//1.Constructor name and class name should be same
		//2.Constructor does not have any return type
		//3.Constructor cannot be abstract/static/final
		
		// 2 types of constructor
		//1.Default constructor---can be created only once
		//2.Parameterized constructor ---can be created 'n' number of times, but the parameters should be different
		
	localgobslconstructor (){
			System.out.println("this is default constructor ");
		}
	 
	localgobslconstructor(int a){
			System.out.println("this is parameterized  constructor ");
		}
		
		int a=100;
		int b=20;
		
		
		// declared with in the method---local var
		void add()
		{
			int a=10;
			int b=30;
			System.out.println(a+b);
		}
		void sub() {
			System.out.println(a-b);
		}
	  void mul()
	  {
		  int a=10;
			int b=30;                                                                            
		System.out.println(a*b);
	   }
	   void div() { 
		System.out.println(a/b); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localgobslconstructor x= new  localgobslconstructor();
		localgobslconstructor y= new  localgobslconstructor(10);
		x.add();
	}}
