package exceptionhandling;

public class trows {
	void checksum(int num) throws ArithmeticException {
        if (num < 1) {
            throw new ArithmeticException("Number is negative, cannot calculate square.");
        } else {
            System.out.println(num * num);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
trows x =new trows();
try {
    x.checksum(1);
    x.checksum(4);
    x.checksum(-1);
}
catch (ArithmeticException e) {
    System.out.println("data is not valid.");
}                                                        
	}

}
