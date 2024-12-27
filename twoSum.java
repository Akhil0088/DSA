package com.cabook.demo;
import java.util.*;
public class twoSum {
	public static int[] twooSum(int[] array, int target) {
		int[] ans = new int[2];
		ans[0] = ans[1] = -1;
		HashMap<Integer, Integer> mpp = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			int required = target - array[i];
			if(mpp.containsKey(required)) {
				ans[0] = mpp.get(required);
				ans[1] = i;
				return ans;
			}
			mpp.put(array[i], i);
		}
		return ans;
	}
}
