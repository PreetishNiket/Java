package Recursion;

import java.util.Scanner;

public class PowerRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int pow=scan.nextInt();
		System.out.println(pow(x,pow));
		scan.close();
	}

	private static int pow(int x, int pow) {
		if(pow==0) {
			return 1;
		}
		int pnm=pow(x,pow-1);
		int p=x*pnm;
		return p;
	}

}
