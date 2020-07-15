package Arrays;

import java.util.Scanner;

public class WavePrintandSpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[][]=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
				}
			}
			else {
				for(int j=a[i].length-1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
		System.out.println(" End");

	}

}
