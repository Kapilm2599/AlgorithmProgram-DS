package com.blz.ds;

import java.util.*;

public class BubbleSort {
	
	static void printSortedArray(int arr[]) {
		System.out.println();
		System.out.println("Ater sorting");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scan.nextInt();
		System.out.println("Enter elements of array");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Before Sorting elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printSortedArray(arr);
	}

}
