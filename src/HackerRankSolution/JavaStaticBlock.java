package HackerRankSolution;

import java.util.Scanner;

public class JavaStaticBlock {
	static int b;
	static int h;
	static boolean flag;
	static {
		Scanner scan = new Scanner(System.in);
		b = scan.nextInt();
		h = scan.nextInt();
		flag = false;
		if (b <= 0 || h <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
	}

	public static void main(String[] args){
			if(flag){
				int area=b*h;
				System.out.print(area);
			}
			
		}
}
