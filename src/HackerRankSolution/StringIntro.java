package HackerRankSolution;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		System.out.println(a.length() + b.length());
		if (a.compareTo(b) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(capitalFirst(a)+" "+capitalFirst(b));
		scan.close();
	}

	private static String capitalFirst(String str) {

		if (str.length() == 0) {
			return "";
		} else {
			String ans = str.substring(0, 1).toUpperCase() + str.substring(1);
			return ans;
		}
	}

}
