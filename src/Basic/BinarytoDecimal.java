package Basic;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int bnum=scan.nextInt();
		scan.close();
		int i=0;
		int sum=0;
		while(bnum!=0)
		{
			int rem=bnum%10;
			int pow=(int) Math.pow(2, i);
			int temp=rem*pow;
			sum=sum+temp;
			bnum=bnum/10;
		}
		System.out.println(sum);
	}

}
