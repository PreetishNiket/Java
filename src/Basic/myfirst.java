package Basic;

import java.util.Scanner;

public class myfirst {

	public static void main(String[] args) {
		//System.out.println("Hello World");
//		System.out.println("Hello World");
		//System.out.println("Hello World\t");
		Scanner scan = new Scanner(System.in);
		// int a = scan.nextInt();
		//float f = scan.nextFloat();
		//long l = scan.nextLong();
		//double d = scan.nextDouble();
		String s = scan.nextLine();
		char ch = scan.next().charAt(7);
//		System.out.println("Integer "+ a);
//		System.out.println("Floats " +f);
//		System.out.println("long " +l);
//		System.out.println("double " +d);
		System.out.println("String " + s);
		System.out.println("Character "+ch);
		scan.close();
		
	}

}
