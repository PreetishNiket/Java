package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		StringBuilder sb= new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
		scan.close();
	}

}
