package Basic;

import java.util.Scanner;

public class GcdandLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int gcd=1;
		scan.close();
		for(int i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		System.out.println("-----------------------");
		int lcm=(a*b)/gcd;
		System.out.println(lcm);
	}

}
