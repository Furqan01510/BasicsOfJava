package PatternsOne;
import java.util.Scanner;

public class TrianglePattern3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int p=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {	// j<=i
				System.out.print(p);// p
				p++;	// increment of p
				j++;
			}
			System.out.println();
			i++;
		}
	}
}