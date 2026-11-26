package day9;

public class thiskeywordtest {
	int a=700000;
	int b=10;
	thiskeywordtest()
	{
		this("name of  car");
		}
	void add(int a,int b)
	{
		this. a=a;
		this.b=b;

		System.out.println("on road  price = " +a);
		System.out.println("mileage = "+ b);
	
	}
	
thiskeywordtest(String n)
{
System.out.println("Maruti Suzuki Shift");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeywordtest y= new thiskeywordtest();
		y.add(700000,10);
	}

}
