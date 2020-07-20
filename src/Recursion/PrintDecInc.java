package Recursion;

import java.util.Scanner;

public class PrintDecInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		Pdein(n);
		scan.close();
	}

	private static void Pdein(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		Pdein(n-1);
		System.out.println(n);
	}

}
