package PatternsOne;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {	
				System.out.print("*");	// star
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
