package day9;

public class method {
	/* accessmodifier returntype methodname()
	 
	{
	  statements;
	  }
	  */
	  // 4 ways to declare a method
	  
	  // 1. no return type , no parameter
	  //void----it returns nothing...just print whatever inside method
	  
	  void addition() {
		  System.out.println("this is addition");
	  }
	  
	  //2. no return type, has parameter
	  public void subtraction(int a, String name)
	  {
		  System.out.println("this is subtraction");
	  }
	  
	  //3.has return type, no parameter
	  
	  private double multiplication()
	  {
		  return 10.98;
	  }
	  //4.Has return type, has parameter
	  
	protected int divison(String n) {
		  return 12;
	  }
	  
	  
	  
	 
	//4 access modifiers in java
	// private , default, protected, public
	 
	  // whenever you declare any variable or method as private
	  
	  // you can access those variables and methods within the same class
	  
	  
	 
	//whenever you declare any variable or method as default
	  
	// you can access those variables and methods within the same class, outside the class but within the same package
	  
	  
	//whenever you declare any variable or method as protected
	  
	// you can access those variables and methods within the class, outside the class ,outside the package but using inheritance concept----extends
	  
	  
	  
	  
	//whenever you declare any variable or method as public
	  
	// you can access those variables and methods within the class, outside the class ,outside the package w/o using inheritance concept
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method obj=new method();
		obj.subtraction(11,"ram");
		System.out.println(obj.divison("sri"));
		

	}

}
