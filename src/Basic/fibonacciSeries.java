package Basic;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int f=0;
		int s=1;
		int i=0;
		int sum;
		//System.out.print(f+","+s);
		while(i<n)
		{
			System.out.print(f+",");
			sum=f+s;
			f=s;
			s=sum;
			
			i++;
		}
		

	}

}
