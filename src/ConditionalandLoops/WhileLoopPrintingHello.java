package ConditionalandLoops;
import java.util.Scanner;
public class WhileLoopPrintingHello {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		// Condition i is Less than n
		while(i<=n) {
			System.out.println("Hello");
			i++;
		}
	}
}
