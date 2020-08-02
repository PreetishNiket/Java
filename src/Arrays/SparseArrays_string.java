package Arrays;

import java.util.Scanner;

public class SparseArrays_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a[] = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.next();
		}
		int q = scan.nextInt();
		String query[] = new String[q];
		for (int i = 0; i < q; i++) {
			query[i] = scan.next();
		}
		int counter = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j].equals(query[i])) {
					counter++;
				}
			}
			System.out.println(counter);
			counter = 0;
		}
		scan.close();
		}
}
