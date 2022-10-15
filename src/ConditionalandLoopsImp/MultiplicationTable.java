package ConditionalandLoopsImp;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n,i=0,j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(i<=10) {
			j=i*n;
			System.out.println(j);
			i++;
		}
	}
}