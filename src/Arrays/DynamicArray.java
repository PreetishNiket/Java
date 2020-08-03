package Arrays;

import java.util.*;

public class DynamicArray {
	List<Integer> seq = new ArrayList<Integer>();
	List<List<Integer>> seqList = new ArrayList<List<Integer>>();
	int lastans=0;
	public DynamicArray(int n) {
		for(int i=0;i<n;i++) {
			seq=new ArrayList<Integer>();
			seqList.add(seq);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		DynamicArray d=new DynamicArray(n);
		for(int i=0;i<q;i++) {
			int qtype=scan.nextInt();
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(qtype==1) {
				d.putFun(x, y, n);
			}else {
				d.getFun(x,y,n);
			}
		}
		scan.close();
	}
	private void getFun(int x, int y, int n) {
		int col=0;
		int row=(x^lastans)%n;
		col=y%seqList.get(row).size();
		lastans=seqList.get(row).get(col);
		System.out.println(lastans);
		
	}
	 void putFun(int x,int y,int n) {
		int row=(x^lastans)%n;
		seqList.get(row).add(y);
	}
}
