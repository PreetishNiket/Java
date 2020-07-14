package Arrays;

import java.util.Scanner;

public class RotateArray {

	public static void m(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0) {
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
			t--;
		}
		scan.close();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0)
        {
            int N = in.nextInt();
            int D = in.nextInt();
            int a[]= new int[N];
            for(int i=0; i<N; i++)
            {
               a[i] = in.nextInt();
            }
            StringBuffer s = new StringBuffer();
            for(int i=D; i<N; i++ )
            {
                s.append(a[i]+" ");
            }
            for(int i=0;i<D;i++)
            {
                s.append(a[i]+" ");
            }
            System.out.println(s);
        }
	}
}
