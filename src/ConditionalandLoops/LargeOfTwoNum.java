package ConditionalandLoops;

import java.util.Scanner;
public class LargeOfTwoNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		// Method 1
		if(a>b) {
			System.out.println("A is Greater");
		}else if(b>a) {
			System.out.println("B is Greater");
		}else {
			System.out.println("Both are Equal Numbers");
		}	
	}
}
