package ConditionalandLoops;
import java.util.Scanner;
public class WhileLoopPrinting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		// Condition is N is greater than i
		while(n>=i) {
			System.out.println("Hello");
			i++;
		}
	}
}
