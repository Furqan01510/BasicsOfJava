package BascisOfJava;

import java.util.Scanner;

public class ScannerDataTypeInput {

	public static void main(String[] args) {
		// Scanner for String & Single Character

		Scanner s = new Scanner(System.in);
		// String Data type Declaration for Scanner input
	
		String strLine = s.nextLine(); // Take Input Complete Line
		String str = s.next();			// Take Input one World
	
	
		char ch = str.charAt(0);		// Take input from str index(0)
		
		System.out.println(str); // Printing str Value
		System.out.println(strLine); // Printing str Value
		System.out.println(ch);	// Printing str Value
	
	}
}
