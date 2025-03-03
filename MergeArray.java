package com.cabook.demo;

import java.util.Arrays;

public class MergeArray {
	public static void MergeSortedArray(int[] arr1, int[] arr2) {
		int left = arr1.length -1;
		int right = 0;
		
		while(left >=0 && right<arr2.length) {
			if(arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;	
				left --;
				right ++;
			}
			else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        
	}
}
