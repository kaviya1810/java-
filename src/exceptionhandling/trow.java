package exceptionhandling;

public class trow {
	void checksum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("Number is negitive, cannot calculate squre.");
		}
		else
		{
			System.out.println(num*num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
trow x = new trow();
x.checksum(1);
x.checksum(4);
x.checksum(-1);
	}

	}


