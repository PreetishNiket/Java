package Strings;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
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
