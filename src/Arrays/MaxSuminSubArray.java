package Arrays;

import java.util.Scanner;

public class MaxSuminSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int ans=Integer.MIN_VALUE;
		int maxSumtillnow=0;
		for(int i=0;i<a.length;i++) {
			maxSumtillnow=maxSumtillnow+a[i];
			if(maxSumtillnow>ans) {
				ans=maxSumtillnow;
			}
			if(maxSumtillnow<0) {
				maxSumtillnow=0;
			}
		}
		System.out.println(ans);
		scan.close();
	}

}
