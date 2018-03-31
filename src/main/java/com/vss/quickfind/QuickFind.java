package com.vss.quickfind;

public class QuickFind {
    private int[] ids;

    public QuickFind(int n){
    	ids = new int[n];
        for(int i=0; i < n; i++){
            ids[i] = i;
        }
    }
    
    public boolean isConnected(int p, int q) {
    	
    	return ids[p] == ids[q];
    }
    
    public void union(int p, int q) {
    	int pid = ids[p];
    	int qid = ids[q];
    	
    	for (int i = 0; i < ids.length; i++) {
			if(ids[i] == pid) {
				ids[i]=qid;
			}
		}
    }
}
