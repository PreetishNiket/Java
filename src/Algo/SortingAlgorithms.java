package Algo;

import java.util.Scanner;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		bubbleSort(a);
		display(a);
		scan.close();
	}

	private static void display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	
	}

	private static void bubbleSort(int[] a) {
			for(int i=1;i<a.length;i++) {
				for(int j=0;j<a.length-i;j++) {
					if(a[j]>a[j+1]) {
						swap(a, j, j+1);
					}
				}
			}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
