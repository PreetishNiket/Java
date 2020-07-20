package Recursion;

import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fact(n));
		
		//System.out.println(numberofFactorial(n));
		scan.close();
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
		return 1;
		}
		int fn=n*fact(n-1);
		return fn;
	}
	

}
