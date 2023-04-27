package com.blz.ds;

public class InsertionSort {
	
	static void printSortedArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 65, 47, 42, 1, 99 };
		for (int i = 1; i < arr.length; i++) {
			
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		printSortedArray(arr);
	}


}
