package day9;

public class methodpratice {
	
void carname  ()
{
	System.out.println("car name = Bolero");
	}
private void  seat (int a)
{
System.out.println("No of seats = "+a);
	}
private String Enginee ()
{
	return "1.5l";
}
protected int power (String m)
{
	return 76;
}
public int Torque(int a)
{
return 210;
}
void  length (int c)
{
	System.out.println( "length = "+ c);
}
public int width ()
{
	return 1745;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodpratice  car = new methodpratice();
car.carname();
car.seat(7);
System.out.println("Enginee = " + car.Enginee());
System.out.println("Power = "+ car.power("type"));
System.out.println( "Torque =  "+ car.Torque(4));
car.length(3995);
System.out.println ("Width = "+ car.width());

}

}
