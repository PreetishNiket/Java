package Algo;

import java.util.Scanner;

public class QuickSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int lo = 0;
		int hi = a.length - 1;
		quickSort(a,lo,hi);
	}

	private static void quickSort(int[] a, int lo, int hi) {
		//base case
		
		int mid =(lo+hi)/2;
		int left=lo;
		int right=hi;
		int pivot=a[mid];
		while(left<right) {
			while(a[left]<pivot) {
				left++;
			}
			while(a[right]>pivot) {
				right--;
			}
			if(left<=right) {
				//swap
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		//smaller problem
		
	}

}
