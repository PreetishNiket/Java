package Arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int q[][] = new int[m][3];
		for (int i = 0; i <m; i++) {
			q[i][0] = scan.nextInt();
			q[i][1] = scan.nextInt();
			q[i][2] = scan.nextInt();
		}
		long max = arrayManipulation(n, q);
		System.out.println(max);
		scan.close();
	}

	private static long arrayManipulation(int n, int[][] q) {
		long output[]=new long[n+2];
		for(int i=0;i<q.length;i++) {
			int a=q[i][0];
			int b=q[i][1];
			int k=q[i][2];
			output[a]=output[a]+k;
			output[b+1]=output[b+1]-k;
		}
		long max=findMax(output);
		return max;
	}

	private static long findMax(long[] input) {
		long sum=0;
		long max=Long.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			sum+=input[i];
			max=Math.max(max, sum);
		}
		return max;
	}

}
