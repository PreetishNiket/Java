package HackerRankSolution;
import java.util.*;

public class AnagramCaseInsens {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String a, String b) {
		
		
		char ch1[]=a.toLowerCase().toCharArray();
		char ch2[]=b.toLowerCase().toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 if(Arrays.equals(ch1, ch2)) {
			 return true;
		 }
		return false;
	}

}
