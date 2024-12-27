package com.cabook.demo;
import java.util.*;

public class LeftRotation {
	
	public static int[] LeftRotateArray(int[] arr, int d ) {
		int n = arr.length;
		d = d % n;
		
		int[] temp = new int[d];
		for(int i=0; i<d;i++) {
			temp[i] = arr[i];
		}
		
		for(int i= d; i<n; i++) {
			arr[i-d] = arr[i];
		}
		int j =0;
		for(int i=n-d; i<n; i++) {
			arr[i] = temp[j];
			j++;
		}
		return arr;
	}
	
	public static int[] MoveZeroes(int[] arr) {
		
		int j = -1;
		//This is done to get the first ) index in an array
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		if(j == -1) return arr;
		
		
		for(int i=j+1; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		return arr;
	}
	
	// Union of two sorted integer arrays
	static ArrayList<Integer> FindUnion(int[] arr,int arr1[] ){
		
		int n = arr.length;
		int s = arr1.length;
		
		ArrayList<Integer> Union = new ArrayList<>();
		int i=0;
		int j =0;
		while(i <n && j < s) {
			if(arr[i] < arr1[j]) {
				if(Union.size() == 0 || Union.get(Union.size()-1) != arr[i]) {
					Union.add(arr[i]);
					i++;
				}
			}
			else {
				if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[j]) {
					Union.add(arr1[j]);
					j++;
				}
			}
		}
		while(i < n) {
			if(Union.size() == 0 || Union.get(Union.size()-1) != arr[i]) {
				Union.add(arr[i]);
				i++;
			}
		}
		while(j<s) {
			if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[j]) {
				Union.add(arr1[j]);
				j++;
		}
	}
		return Union;
}
	
	public static void main(String[] args) {
		int[] array = {1,0,9,0,4,6,0,1,5,9};
		int r = 5;
		//LeftRotateArray(array,r);
		MoveZeroes(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
 	}
}
