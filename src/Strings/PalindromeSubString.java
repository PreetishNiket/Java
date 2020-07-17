package Strings;

import java.util.Scanner;

public class PalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String sub = "";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				sub = str.substring(i, j);
				if(isPalindrome(sub)) {
					count++;
				}	
			}
		}
		System.out.println(count);
		scan.close();
	}
	public static boolean isPalindrome(String sub) {
		for(int i=0;i<=sub.length()/2;i++) {
			if(sub.charAt(i)==sub.length()-i-1) {
				return true;
			}
		}
		return false;
	}
}
