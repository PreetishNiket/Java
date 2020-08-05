package HackerRankSolution;

import java.util.Scanner;

public class JavaDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long n = scan.nextLong();
				System.out.println(n+" can be fitted in:");
				if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
					System.out.println("* byte");
				}
				if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
				
			} catch (Exception e) {
				 System.out.println(scan.next()+" can't be fitted anywhere.");
			}
		}
		scan.close();
	}

}
