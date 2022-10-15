package PatternsOne;

import java.util.Scanner;

public class StarPattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int p=n;	// p = n
		while(i<=n) {
			int j=1;
			while(j<=p) {	// j<=p
				System.out.print("*");	// star
				j++;
			}
			System.out.println();
			p--;	// p--;
			i++;
		}
	}
}
