package Algo;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 10, 20, 30, 40, 50 };
		int[] a2 = { 15, 25, 30, 45, 55, 60, 70 };
		int[] ans = mergeTwoSortedArrays(a1, a2);
		for (int val : ans) {
			System.out.print(val + " ");
		}

	}

	private static int[] mergeTwoSortedArrays(int[] a1, int[] a2) {
		int merged[] = new int[a1.length + a2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				merged[k] = a1[i];
				i++;
				k++;
			} else {
				merged[k] = a2[j];
				j++;
				k++;
			}
		}
		if (i == a1.length) {
			while (j < a2.length) {
				merged[k] = a2[j];
				j++;
				k++;
			}
		}
		if (j == a2.length) {
			while (i < a1.length) {
				merged[k] = a1[i];
				i++;
				k++;
			}
		}
		return merged;
	}

}
