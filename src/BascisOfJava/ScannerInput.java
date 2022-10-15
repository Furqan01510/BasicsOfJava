package BascisOfJava;

import java.util.Scanner; // Scanner Package

public class ScannerInput {

	public static void main(String[] args) {
		// Scanner input 
		Scanner s = new Scanner(System.in); //Scanner Object Declaration
		
		// Data Declaration & input Value 
		int a = s.nextInt(); 
		int b = s.nextInt();
		
		int c = a + b; // Data type Declaration & Addition Operation
		
//		System.out.println(a);  // Print Given value a
//		System.out.println(b);	// Print Given value b
		System.out.println(c); 	// Printing Addition of given numbers
		
		
	}

}
