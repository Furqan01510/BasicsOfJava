package BascisOfJava;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Arithmetic Operators
		
		int a = 10, b = 30, c;
		c = a + b; // Addition Operator
		System.out.println(c);	// Printing Addition of a & b
		c = a - b; // Subtraction Operator
		System.out.println(c); // Printing Subtraction of a & b
		c = a * b;
		System.out.println(c); // Printing Multiplication of a & b
		c = a / b;	// Division Operator
		System.out.println(c); // Printing Division of a & b
		c = a % b;  // Modular Operator
		System.out.println(c); // Printing Remainder of a & b
		System.out.println();
		int e=10, f=3, g; 	// Declaration new Variables 
		g = e % f; // Modular Operator 
		System.out.println(g); // Printing Remainder of e & f
		double h = e / f; // Storing Division of e / f
		System.out.println(h); // Printing Subtraction of a & b
		System.out.println();
		g  =  3 + 2 / 5;	// Addition & Division perform as Precedence
		System.out.println(g); // Printing result
		g  =  3 * 2 / 5;	// Multiplication & Division perform as Precedence
		System.out.println(g); // Printing result
		System.out.println();
		int i=3,j=10,k; 	// Declaration of i,j, k values
		k = j / (2 * i); 	// Performing according to formula b/(2*a)
		System.out.println(k); // Printing result	
	}
}
