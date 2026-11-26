package wrapperclass;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive data types

        int a = 10;

        double b = 20.5;

        char c = 'A';
 
        // Boxing: primitive -> wrapper object

        Integer x = Integer.valueOf(a);

        Double y = Double.valueOf(b);

        Character z = Character.valueOf(c);
 
        System.out.println("Integer object: " + x);

        System.out.println("Double object: " + y);

        System.out.println("Character object: " + z);
 
        // Unboxing: wrapper object -> primitive

        int p = x.intValue();

        double q = y.doubleValue();

        char r = z.charValue();
 
        System.out.println("Unboxed int: " + p);

        System.out.println("Unboxed double: " + q);

        System.out.println("Unboxed char: " + r);
 
        // Autoboxing

        Integer n = 100;
 
        // Auto-unboxing

        int m = n;
 
        System.out.println("Autoboxing: " + n);

        System.out.println("Auto-unboxing: " + m);
 

	}

}
