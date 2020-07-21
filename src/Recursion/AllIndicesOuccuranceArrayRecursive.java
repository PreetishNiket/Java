package Recursion;

import java.util.Scanner;

public class AllIndicesOuccuranceArrayRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int i = 0;
		int count = 0;
		int element = scan.nextInt();
		int b[]=allIndices(a, i, element, count);
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+",");
		}
		scan.close();
	}

	private static int[] allIndices(int[] a, int i, int element, int count) {
		if (i == a.length) {
			int result[] = new int[count];
			return result;
		}
		int indices[] = null;
		if (a[i] == element) {
			indices = allIndices(a, i + 1, element, count + 1);
		} else {
			indices = allIndices(a, i + 1, element, count);
		}
		if (a[i] == element) {
			indices[count] = i;
		}
		return indices;
	}
}
