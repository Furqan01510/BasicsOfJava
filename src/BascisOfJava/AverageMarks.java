package BascisOfJava;

import java.util.Scanner;


public class AverageMarks {

	public static void main(String[] args) {
		// Average Marks of 3 Subjects
		
		Scanner s = new Scanner(System.in);
		
		int m1,m2,m3; // Variable Declaration
		
		char ch = s.next().charAt(0); // Take Single Character Input
		
		// Taking integer input	
		m1=s.nextInt(); 
		m2=s.nextInt();
		m3=s.nextInt();
		
		System.out.println(ch); // Printing First Character
		System.out.println((m1+m2+m3)/3); // Average formula 
		
	}
}
