package Basic;

import java.util.Scanner;

public class sumOfFirstNTerms {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		System.out.println(a);
	}

}
