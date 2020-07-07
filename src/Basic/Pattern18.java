package Basic;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int row=1;
		int nsp=n/2;
		int nst=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<=n/2)
			{
				nsp--;
				nst=nst+2;
			}
			else {
				nsp++;
				nst=nst-2;
			}
			row++;
		}

	}

}
