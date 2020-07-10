package Arrays;

import java.util.Scanner;

public class MaximuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			
		}
		scan.close();
		int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
		}
		System.out.println(max);
	}

}
