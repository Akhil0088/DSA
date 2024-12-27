package com.cabook.demo;

public class Rotate {
	
	public static int[] RotateArray(int[] arr, int k) {
		int size = arr.length;
		k = k % size;
		int temp[] = new int[100];
		
		for(int i=0; i<k;i++) {
			temp[i] = arr[i];
		}
		for(int i=k; i<size ;i++) {
			arr[i-k] = arr[i];
			
		}
		int j =0;
		for(int i=size-k; i<size;i++) {
			arr[i] = temp[j];
			j++;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] array = { 1,2,3,4,5,6,7};
		RotateArray(array, 20);
		for(int i=0; i<array.length;i++)
		System.out.print(array[i] + " ");
	}

}
