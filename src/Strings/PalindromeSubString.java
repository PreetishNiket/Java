package Strings;

import java.util.Scanner;

public class PalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder sb;
		String sub = "";
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				sub=str.substring(i, j);
				sb=new StringBuilder(sub);
				sb.reverse();
				if(sb.toString().equals(sub)) {
					count++;
					System.out.println(sub);
				}
			}
		}
		System.out.println(count);
		//method(str);
		scan.close();
	}
}
