package com.vss.quickfind;

public class QuickUnionWeighted {

	private int[] ids;
	private int[] weights;

	public QuickUnionWeighted(int n) {
		ids = new int[n];
		weights = new int[n];
		for (int i = 0; i < n; i++) {
			ids[i] = i;
			weights[i] = 1;
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
		if(weights[i] < weights[j]) {
			ids[i] = j;
			weights[i] += weights[j];
		}else {
			ids[j] = i;
			weights[j] += weights[i];
		}
	}
	
	public static void main(String[] args) {
		QuickUnionWeighted qu = new QuickUnionWeighted(9);
		
		qu.union(0, 5);
		qu.union(6, 5);
		qu.union(2, 7);
		qu.union(5, 8);
		System.out.println(qu.isConnected(1, 8));
	}
}
