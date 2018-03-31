package com.vss.quickfind;

public class QuickUnion {

	private int[] ids;

	public QuickUnion(int n) {
		ids = new int[n];
		for (int i = 0; i < n; i++) {
			ids[i] = i;
		}
	}
	
	private int root(int i) {
		while(i != ids[i]) {
			i = ids[i];
		}
		return i;
	}
	
	private boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	
	private void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		
		ids[i] = j;
	}
	
	public static void main(String[] args) {
		QuickUnion qu = new QuickUnion(9);
		
		qu.union(0, 5);
		
		qu.union(2, 7);
		
		System.out.println(qu.isConnected(0, 5));
	}

}
