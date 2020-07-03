package Basic;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int a=0;
		int temp=num;
		while(num!=0)
		{
			int rem =num%10;
			a=a*10+rem;
			num=num/10;
		}
		if(a==temp)
		{
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not a Palindrome");
			System.out.println("Reverse:"+a);
		}

	}

}
