package Arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			int n=scan.nextInt();
			int k=scan.nextInt();
			int a[]=new int[n];
			for(int i=0;i<a.length;i++) {
				a[i]=scan.nextInt();
			}

			int temp;
			for(int i=0;i<k;i++) {
				temp=a[0];
				for(int j=0;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				a[a.length-1]=temp;
			}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+",");
			}
			scan.close();
	}

}
