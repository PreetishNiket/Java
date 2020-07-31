package Arrays;

import java.util.Scanner;

public class MaxSumHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int result=maxSumHourGlass(a);
		System.out.println(result);
		scan.close();
	}

	private static int maxSumHourGlass(int[][] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length-2;i++){
            for(int j=0;j<a[i].length-2;j++){
                int sum =(a[i][j]+a[i][j+1]+a[i][j+2]
                            +a[i+1][j+1]
                            +a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
                            if(sum>max){
                                max=sum;
                            }
            }
        }
		return max;
	}
}
//6
//6
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0