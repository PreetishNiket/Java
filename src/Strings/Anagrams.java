package Strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int count1=0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j <= str1.length(); j++) {
				if (str1.charAt(i)==str1.charAt(j)) {
					count1++;
				}
			}
		}
	}

}
