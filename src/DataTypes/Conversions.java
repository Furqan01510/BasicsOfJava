package DataTypes;

public class Conversions {

	public static void main(String[] args) {
		// Data types and value declaration
		byte b;
		int i = 257;
		double d = 323.142;

		System.out.println("Conversion of int to byte");
		b = (byte)i;
		System.out.println("i & b :"+i+" & "+b);

		System.out.println("Conversion of double to int");
		i =(int)d;
		System.out.println("d & i :"+d+" & "+i);

		System.out.println("Conversion of double to byte");
		b = (byte)d;
	}
}
