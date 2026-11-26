package collection;

import java.util.ArrayList;

public class listdemo {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Declaration
ArrayList mylist=new ArrayList();
	
	
	//Adding data into arraylist
	mylist.add(100);
	mylist.add(10.5);
	mylist.add("welcome");
	mylist.add('A');
	mylist.add(true);
	mylist.add(100);
	mylist.add(null);b                                                                                                                    /
	mylist.add(null);
	mylist.add("JavaProgrammimg");
	
	
	//Size of arraylist
	System.out.println("Size of an arraylist:"+mylist.size()); //8
	
	//Printing arraylist
	System.out.println("Printing data from arraylist:"+mylist); //[100, 10.5, welcome, A, true, 100, null, null]
	
	//Remove element from arraylist
	mylist.remove(5);  // here 5 is index of element
	System.out.println("After removing:"+mylist); //[100, 10.5, welcome, A, true, null, null]
	System.out.println("Size of an arraylist:"+mylist.size()); //8
	//Insert element in the arraylist
	mylist.add(2,"java");
	System.out.println("After insertion:"+ mylist); //[100, 10.5, java, welcome, A, true, null, null]

	//Modify element in the arraylist (modify/replace/change)
	mylist.set(2,"python");
	System.out.println("After replacing:"+ mylist); //[100, 10.5, python, welcome, A, true, null, null]
	
	//Access specific element from arraylist
	System.out.println(mylist.get(3));  // here 3 is index   //welcome
	
	//Reading all the elements from arraylist
		//using normal for loop
	for(int i=0;i<mylist.size();i++)
	{
		System.out.println(mylist.get(i));
		
	}
	
	//Cheking arraylist is empty or not
	System.out.println("Is arraylist empty?"+ mylist.isEmpty());
	
	//remove all the elements from array list

	//remove all the elemnts/clear
	mylist.clear();//will  clear  all  value
	System.out.println("Is arraylist empty?"+ mylist.isEmpty());  //true*/



}

}

