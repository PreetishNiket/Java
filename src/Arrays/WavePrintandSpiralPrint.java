package Arrays;

import java.util.Scanner;

public class WavePrintandSpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Wave Print-->");
		wavePrint(a);
		System.out.println("Spiral Print-->");
		spiralPrint(a);
		scan.close();

	}

	private static void wavePrint(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			} else {
				for (int j = a[i].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + " ");
				}
			}
		}
		System.out.println("END");

	}

	private static void spiralPrint(int[][] a) {
		int top = 0;
		int bottom = a.length - 1;
		int left = 0;
		int right = a[top].length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (top <= bottom && left <= right) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(a[top][i] + " ");
						count--;
					}
					dir = 2;
					top++;
				}
			}

			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(a[i][right] + " ");
						count--;
					}
				}
				dir = 3;
				right--;
			}

			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(a[bottom][i] + " ");
						count--;
					}
				}
				dir = 4;
				bottom--;
			}
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(a[i][left] + " ");
						count--;
					}
				}
				dir = 1;
				left++;
			}
		}
		System.out.println("END");
	}
}

// input
//4
//4
//11
//12
//13
//14
//21
//22
//23
//24
//31
//32
//33
//34
//41
//42
//43
//44