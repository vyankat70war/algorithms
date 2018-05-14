/**
 * 
 */
package com.vss.linearsearch;

import java.util.Scanner;

/**
 * @author sattarwa
 *
 */
public class CountVowels {
	
	public static void countVowels(String str) {
		str = str.toLowerCase();
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < T; i++) {
			String str = scanner.nextLine();
			countVowels(str);
		}
		scanner.close();
	}
}
