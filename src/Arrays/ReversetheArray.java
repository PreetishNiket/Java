package Arrays;

import java.util.Scanner;

public class ReversetheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		int j=a.length-1;
		for(int i=0;i<j;i++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			
		}
		for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
				if(i<a.length-1) {
					System.out.print(",");
				}
		}
	}
}
