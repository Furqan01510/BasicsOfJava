package ConditionalandLoops;

import java.util.Scanner;
public class EqualTwoNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if (a==b) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("Both are Not Equal");
		}
	}
}
