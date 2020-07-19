package Recursion;

import java.util.Scanner;

public class PrintDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printDec(n);
		scan.close();
	}

	private static void printDec(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printDec(n - 1);
	}
}
