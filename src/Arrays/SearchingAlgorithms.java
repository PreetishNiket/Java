package Arrays;

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
		int element=scan.nextInt();
		scan.close();
		System.out.println(linearSearch(a, element));
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
}
