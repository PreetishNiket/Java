package Basic;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int row=1;
		int nst=1;
		int nsp=2*n-3;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cstl=1;
			if(row==n) {
				cstl=2;
			}
			while(cstl<=nst) {
				System.out.print("*");
				cstl++;
			}
			System.out.println();
			row++;
			nst++;
			nsp=nsp-2;
		}

	}

}
