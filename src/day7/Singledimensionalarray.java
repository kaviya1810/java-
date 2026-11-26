package day7;

import java.util.Arrays;

public class Singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]={10,20,30,40};
		
		
		//1) Declaring array
		
				//Appraoch1 : declaration
			/*	int a[]=new int[6];
				
				//adding values ino array
				a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
				a[4]=50;
				a[5]=60;*/
				
				
				
				//Appraoch2 : declaration + adding values into array
				int a[]= {10,20,30,40,50};
				
				System.out.println(a[2]);
				//System.out.println(a); // incorrect , should not use
				
				
				
				//3) Find size of an array
				System.out.println(a.length); //returns lenght(size) of an array 5
		 
				//4) read single value from an array
				//System.out.println(a[2]);  //30
				System.out.println(a[0]); //10
				
				//5) read multiple values from an array
				System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
				
				//normal for loop
				for(int i=0;i<=a.length-1;i++)
				{
					System.out.println(a[i]); //10
				}
				
		 
	}

}
//i=o,0<=5-1=0<=4,0++->t
// a[0]=10
//i=1,1<=4,1++
//a[1]=20
