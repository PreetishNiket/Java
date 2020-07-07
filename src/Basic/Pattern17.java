package Basic;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int row=1;
		int nst=n/2;
		int nsp=1;
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
			int csta=1;
			while(csta<=nst) {
				System.out.print("*");
				csta++;
			}
			System.out.println();
			if(row<=n/2) {
				nsp=nsp+2;
				nst--;
			}
			else {
				nsp=nsp-2;
				nst++;
			}
			row++;
		}
	}

}
