package Strings;

import java.util.Scanner;

public class SubStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int k=scan.nextInt();
		String smallest="";
		String largest ="";
		smallest=largest=s.substring(0,k);
		
		for(int i=1;i<=s.length()-k;i++) {
			String substr=s.substring(i,i+k);
			if(smallest.compareTo(substr)>0) {
				smallest=substr;
			}
			if(largest.compareTo(substr)<0) {
				largest=substr;
			}
		}
		scan.close();
		System.out.println(smallest+" "+largest);
	}

}
