package day7;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Appraoch1
		int a[][]=new int[3][2];  // declaration
		
		//adding values
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		System.out.println(a[1][1]);
		
		//Appraoch2 : declaration + adding values
		int b[][]= { {100,200},
					 {300,400},
					 {500,600}
					};
		System.out.println(b[2][1]);
		
		//3) Find size of an array
		System.out.println(a.length); // returns number of rows  3
	System.out.println(a[0].length); // returns number of columns in specific row
	
	for(int i=0;i<=a.length-1;i++)//row
	{
		for(int j=0;j<=a[i].length-1;j++ )//column
		{
			System.out.print(a[i][j]+"    ");
		}
		System.out.println();
	}


	}

}
//i=0,0<=2,0++->t
//j=0,0<=1,0++->t
//a[0][0]=100
//j=1,1<=1,1++->t
//  a[0][0]=100   a[0][1]=200
//j=2,2<=1,->f
//i=1,1<=2,1++->t
//j=0,0<=1,0++->t
//a[1][0]=300
//j=1,1<=1,1++->t
//a[1][0]=300  a[1][1]=400
//j=2,2<=2->f
//i=2,2<=2,2++->t
//j=0,o<=1,0++->t
//a[2][0]=500
//j=1,1<=1,1++-.t>
//   a[2][0]=500  a[2][1]=600
//j=2,2<=1-.f
//i=3,s<=2->f