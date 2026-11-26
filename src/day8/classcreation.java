package day8;

public class classcreation {
	String name ="car names";
	void list ()
	{
	System.out.println("Maruti Suzuki Shift");
	System.out.println("Bolero");	
	System.out.println("Innova Crysta");
	System.out.println("Thar");
	System.out.println("Scorpio-N");
		}
	void shift()
	{
		String name ="Maruti Suzuki Shift";
		float Mileage=10.6f;
		int Noofseats1=5;
		int Airback=2;
		String Color="Green,Withe,Black";
		long onroadprice=700000;
		String fueltype="Pertol/CNG";
		String Transmission="Maual/automatic";
		String Enginee = "1197cc";
		int  groundclearance =163;
		boolean hillHoldControl = false;
		int Lenght =3860;
		int  width=1735;
		int weight =1355;
		int height = 1520;
		String Internet= "advanced/internet -connected features";
		System.out.println("car name: "+name);
		System.out.println( Mileage);
		System.out.println(Noofseats1);
		System.out.println(Airback);
		System.out.println(Color);
		System.out.println(onroadprice);
		System.out.println(fueltype);
		System.out.println(Transmission);
		System.out.println( Enginee);
		System.out.println(groundclearance);
		System.out.println( hillHoldControl);
		System.out.println(Lenght);
		System.out.println( width);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(Internet);
	}
	void Bolero()
	{
		String model="Bolero";
		String type="suv";
		int noofseats2=7;
		String fueltype2="Diesel";
		String Enginee1 ="1.5L";
		int power =76;
		int Torque=210;
		String Transmission2="5-Speed Manual";
		int  groundclearance2 =180;
		int Lenght2 =3995;
		int  width2 =1745;
		int height2= 1880;
		int wheelbase =2680;
		String BestFor ="Rural / rough roads";
		System.out.println("car name : "+ model);
		System.out.println(type);
		System.out.println(noofseats2);
		System.out.println(fueltype2);
		System.out.println(Enginee1 );
		System.out.println(power);
		System.out.println(Torque);
		System.out.println(Transmission2);
		System.out.println(groundclearance2);
		System.out.println (Lenght2);
		System.out.println(width2);
		System.out.println(height2);
		System.out.println(wheelbase);
		System.out.println(BestFor);
	}
	void InnovaCrysta()
	{
		String model3="Innova Crysta";
		String type3 ="MPV";
		int noofseats3=8;
		String fueltype3="Diesel";
		String  Enginee3 ="2.4L";
		int power3 =150;
		int Torque3 =343;
		String Transmission3="5-Speed Manual";
		int  groundclearance3 =178;
		int Lenght3=4735;
		int  width3 =1830;
		int height3=1795;
		int wheelbase3 =2750;
		String BestFor3 ="Family / highway travel";
		System.out.println(" carname :"+ model3);
		System.out.println(type3);
		System.out.println(noofseats3);
		System.out.println(fueltype3);
		System.out.println(Enginee3 );
		System.out.println(power3);
		System.out.println(Torque3);
		System.out.println(Transmission3);
		System.out.println(groundclearance3);
		System.out.println (Lenght3);
		System.out.println(width3);
		System.out.println(height3);
		System.out.println(wheelbase3);
		System.out.println(BestFor3);
	}
void Thar()
{
	String model4="Thar";
	String type4 ="SUV / Off-road";
	int noofseats4=4;
	String fueltype4="Petrol / Diesel";
	String  Enginee4 ="2.0L / 2.2L";
	int power4 = 177;
	int Torque4 =320;
	String Transmission4="6-MT / 6-AT";
	int  groundclearance4=226;
	int Lenght4=3985;
	int  width4 =~1820;
	int height4=1920;
	int wheelbase4 =2450;
	String BestFor4 ="Off-road / styl";
	System.out.println(" car name  :" + model4);
	System.out.println(type4);
	System.out.println(noofseats4);
	System.out.println(fueltype4);
	System.out.println(Enginee4 );
	System.out.println(power4);
	System.out.println(Torque4);
	System.out.println(Transmission4);
	System.out.println(groundclearance4);
	System.out.println (Lenght4);
	System.out.println(width4);
	System.out.println(height4);
	System.out.println(wheelbase4);
	System.out.println(BestFor4);
}
void Scorpio()
{
	String model5="Scorpio-N";
	String type5 ="SUV";
	int noofseats5=7;
	String fueltype5="Petrol / Diesel";
	String  Enginee5 ="2.0L / 2.2L";
	int power5 =203;
	int Torque5 =400;
	String Transmission5="6-MT / 6-AT";
	int  groundclearance5=187;
	int Lenght5=4662;
	int  width5 =1917;
	int height5=1857;
	int wheelbase5 =2750;
	String BestFor5 ="Powerful family SUV";
	System.out.println(" car name :" +model5);
	System.out.println(type5);
	System.out.println(noofseats5);
	System.out.println(fueltype5);
	System.out.println(Enginee5 );
	System.out.println(power5);
	System.out.println(Torque5);
	System.out.println(Transmission5);
	System.out.println(groundclearance5);
	System.out.println (Lenght5);
	System.out.println(width5);
	System.out.println(height5);
	System.out.println(wheelbase5);
	System.out.println(BestFor5);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classcreation car= new classcreation ();
		
System.out.println(car.name);
car.list();
car.shift();
car. Bolero();

	}

}
