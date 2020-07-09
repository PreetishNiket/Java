package Basic;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.close();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int value=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print(value);
				cst++;
			}
			System.out.println();
			row++;
			nst+=2;
			nsp--;
		}

	}

}
