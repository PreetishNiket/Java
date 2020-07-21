package Recursion;

import java.util.Scanner;

public class FirstIndexOuccurenceArrayRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int i = 0;
		int element = scan.nextInt();
		System.out.println(firstIndex(a, i, element));
		scan.close();
	}

	private static int firstIndex(int[] a, int i, int element) {
		if (i == a.length) {
			return -1;
		}
		if (a[i] == element) {
			return i;
		} else {
			int restAns = firstIndex(a, i + 1, element);
			return restAns;
		}
	}

}
