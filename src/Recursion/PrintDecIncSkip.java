package Recursion;

import java.util.Scanner;

public class PrintDecIncSkip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		pdiskip(n);
		scan.close();
	}

	private static void pdiskip(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		pdiskip(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
