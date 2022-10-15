package ConditionalandLoops;
import java.util.Scanner;
public class SumOfNumN {

	public static void main(String[] args) {
		// Sum of N Natural Numbers
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0, sum=0;
		while(i<=n) {
			sum+=i;		// sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}