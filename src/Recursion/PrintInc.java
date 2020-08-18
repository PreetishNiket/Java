package Recursion;

import java.util.Scanner;

public class PrintInc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		Pdi(n);
		scan.close();
	}

	private static void Pdi(int n) {
		if(n==0) {
			return;
		}
		Pdi(n-1);
		System.out.println(n);
	}

}
