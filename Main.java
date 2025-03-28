//operators: Arithmetic
//operators: Relational
//operators: conditional
//operators: Logical
//operators: Bitwise
//bitwise:
public class Main {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(a & b);
		System.out.println(a | b);

		System.out.println(a ^ b);
		System.out.println(~a);	
		int c = 35;
		int z = 99;
		System.out.println("Number:" + c);
		System.out.println("Number2:" + z);
		System.out.println("integerbitcount:" + Integer.bitCount(c));
		System.out.println("integerbitcount:" + Integer.bitCount(z));
		char ch = (char) c;
		System.out.println(c);
		int num1 = 35;
        int num2 = 99;

        System.out.println("Number: " + num1);
        System.out.println("Set bits in " + num1 + ": " + Integer.bitCount(num1));
        System.out.println("Unset bits in " + num1 + ": " + (Integer.SIZE - Integer.bitCount(num1)));

        System.out.println("\nNumber: " + num2);
        System.out.println("Set bits in " + num2 + ": " + Integer.bitCount(num2));
        System.out.println("Unset bits in " + num2 + ": " + (Integer.SIZE - Integer.bitCount(num2)));



	}
}





