/**
 * 
 */
package com.vss.sorting.selection;

/**
 * @author sattarwa
 * 
 *         <ul>
	 *         <li>Divides array in two groups - sorted and unsorted</li>
	 *         <li>each iteration adds minimum value in sorted section at the end of
	 *         section</li>
	 *         <li>best & worst case time complexity O(n^2), space complexity
	 *         O(n)</li>
	 *         <li>effective for small set of data</li>
	 *         <li>Bingo sort is special case of selection sort</li>
	 *         <li>sorting happens in memory</li>
	 *         <li>it has quadratic order of growth (n^2)</li>
 *         <li>efficiency is same as bubble sort</li>
 *         </ul>
 */

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
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
		int[] arr = selectionSort(new int[] { 1, 5, 4, 8, 2, -1 });
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}

}
