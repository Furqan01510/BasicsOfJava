package ConditionalandLoops;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		// Condition 1 Using AND Logic
		System.out.println("Condition 1 Using Logical AND ");
		if(a > 0 && b > 0) {
			System.out.println("Both are Positive");
		}else if(a < 0 && b < 0) {
			System.out.println("Both are Negtive");
		}else {
			System.out.println("One is positive & One is Negative");
		}
		System.out.println();
		// Condition 2 Using OR Logic
		System.out.println("Condition 1 Using Logical OR ");
		if (a > 0 || b > 0) {
			System.out.println("One is Positive");
		}else {
			System.out.println("No one is Positive");
		}	
	}
}