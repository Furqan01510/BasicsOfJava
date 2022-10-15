package ConditionalandLoopsImp;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i;
		for (i=2; i<=n;i++) {
			if (n%i==0) {
				if (i!=n) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
