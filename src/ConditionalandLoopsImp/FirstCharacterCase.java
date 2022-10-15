package ConditionalandLoopsImp;
import java.util.Scanner;
public class FirstCharacterCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		int a = ch;
		if(a>=65 && a<=90) {
			System.out.println("1");	// Indicate that the give number is Capital alphabet
		}else if(a>=97 && a<=122) {
			System.out.println("0");	// Indicate that the give number is Small alphabet
		}else {
			System.out.println("-1");
		}
	}
}