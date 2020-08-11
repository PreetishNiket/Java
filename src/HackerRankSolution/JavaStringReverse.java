package HackerRankSolution;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		scan.close();
	}
}
