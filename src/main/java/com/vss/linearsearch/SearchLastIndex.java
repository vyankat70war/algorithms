/**
 * 
 */
package com.vss.linearsearch;

/**
 * @author sattarwa
 *
 */
public class SearchLastIndex {
	
	public static void searchLastIndex(int []arr, int number) {
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if(j == number) {
				index = i;
			}
		}
		System.out.println(index);
	}
	
	public static void main(String[] args) {
		int []arr = {1,4,3,5,8};
		searchLastIndex(arr, 5);
	}

}
