package ConditionalandLoops;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		// Remainder of a % 2
		if(a%2==0) { 
			System.out.println("Given Number is Even");
		}else {
			System.out.println("Given Number is Odd");
		}	
	}
}
