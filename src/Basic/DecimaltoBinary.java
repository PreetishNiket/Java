package Basic;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int dnum=scan.nextInt();
		scan.close();
		int tenpowers=1;
		int bin=0;
		while(dnum!=0)
		{
			int rem=dnum%2;
			bin+=rem*tenpowers;
			tenpowers*=10;
			dnum/=2;
		}
		System.out.println(bin);
	}

}
