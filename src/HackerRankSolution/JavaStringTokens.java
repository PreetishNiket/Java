package HackerRankSolution;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str.trim();
		scan.close();
		if (str.length() > 400000) {
			return;
		} else if (str.length() == 0) {
			System.out.println(0);
			return;
		} else {
			String[] words = str.split("[!,?.*_'@\\ ]+");
			System.out.println(words.length);
			for (String word : words) {
				System.out.println(word);
			}
		}
	}

}
