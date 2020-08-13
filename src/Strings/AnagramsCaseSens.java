package Strings;

import java.util.Scanner;

public class AnagramsCaseSens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		boolean isAnagram=true;
		if(str1.length()!=str2.length()) {
			isAnagram=false;
		}
		int ascii[]=new int[256];
		for(char c:str1.toCharArray()) {
			int index = (int)c;
			ascii[index]++;
		}
		for(char c:str2.toCharArray()) {
			int index=(int)c;
			ascii[index]--;
		}
		for(int i=0;i<256;i++) {
			if(ascii[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
		scan.close();
	}
}
