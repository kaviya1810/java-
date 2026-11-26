package collection;

import java.util.HashMap;

public class mapdemo {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	//declaraiton
	//HashMap hm=new HashMap();
	//Map hm=new HashMap();
		
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	
	//Adding pairs
	hm.put(101,"John");
	hm.put(102,"Scott");
	hm.put(103,"Mary");
	hm.put(104,"Scott");
	hm.put(102,"David");                                                                                        
	
	System.out.println(hm);  //{101=John, 102=David, 103=Mary, 104=Scott}
	
	System.out.println("Size of hashmap:"+ hm.size());  //4
	
	
	//remove pair
	//hm.remove(103); // 103 is key of the pair
	//System.out.println("After removing pair:"+ hm);  //{101=John, 102=David, 104=Scott}
	
	//access value of the key
	System.out.println(hm.get(102));  // 102 is key  //David
	
	//get all the keys from hashmap
	System.out.println(hm.keySet());  //[101, 102, 104]---keys  alone
	System.out.println(hm.values()); //[John, David, Scott]-->values
	System.out.println(hm.entrySet());  //[101=John, 102=David, 104=Scott]-->valuses and varaible  in keyset
	

}

}
