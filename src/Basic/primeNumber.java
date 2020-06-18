package Basic;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+",");
			}
			
		}
		
		scan.close();
	}
	public static boolean isPrime(int n)
	{
		int i=2;
		while(i<n)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}	
		return true;
	}
	
}
