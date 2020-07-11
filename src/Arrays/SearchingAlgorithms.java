package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int element=scan.nextInt();
		scan.close();
		System.out.println(linearSearch(a, element));
		System.out.println(binarySearch(a, element));
	}
	public static int linearSearch(int a[],int element)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int a[],int element){
		
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(element>a[mid]) {
				low=mid+1;
			}
			else if(element<a[mid]) {
				high=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
