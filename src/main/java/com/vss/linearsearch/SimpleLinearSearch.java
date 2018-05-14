/**
 * 
 */
package com.vss.linearsearch;

/**
 * @author sattarwa
 *
 */
public class SimpleLinearSearch {
	
	public static void linearSearch(int []arr, int number) {
		
		for (int i : arr) {
			if(i == number) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int []arr = {1,4,3,5,8};
		linearSearch(arr, 5);
	}

}
