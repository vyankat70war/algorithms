/**
 * 
 */
package com.vss.sorting.selection;

/**
 * @author sattarwa
 *
 */
public class SelectionSort {
	
	public static int[] selectionSort(int []arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr = selectionSort(new int[]{1,5,4,8,2,-1});
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}

}
