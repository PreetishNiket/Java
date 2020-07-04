package Basic;

import java.util.Scanner;

public class Krotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		int n = num;
		int nod = 0;
		while (n != 0) {
			nod++;
			n = n / 10;
		}
		k = k % nod;
		if (k < 0) {
			k=k+nod;
		}
		int divisor=(int)Math.pow(10,k);
		int rem=num%divisor;
		num=num/divisor;
		int ans=rem*(int)Math.pow(10, nod-k)+num;
		System.out.println(ans);
	}

}
