package PatternsOne;
import java.util.Scanner;

public class TrianglePattern1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {	// j<=i
				System.out.print(i);	// i
				j++;
			}
			System.out.println();
			i++;
		}
	}
}