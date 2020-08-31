package arrays;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		
		
		int arr[] = {1,0, -1, 0, -2, 2};
		
		List<List<Integer>> op = findFoursum(arr, 0, 0, 4);
		
		System.out.println("The quadruplets are " + op);

	}

	private static List<List<Integer>> findFoursum(int[] arr, int target, int start, int k) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);
		
		if(start == arr.length || arr[start]*k >target || target > arr[arr.length-1]*k) {
			return res;
		}
		
		//[-13, -5, -1, 1, 2, 2, 3, 8]
		if(k==2) {
			return twoSum(arr, target, start);
		}
		
		for(int i=start; i<arr.length; i++) {
			
			if(i==start || arr[i-1] != arr[i]) {
				
				for(List<Integer> set : findFoursum(arr, target-arr[i], i+1, k-1)) {
					
					res.add(new ArrayList<>(Arrays.asList(arr[i])));
					res.get(res.size()-1).addAll(set);
				}
				
			}
			
		}

		return res;
	}

	private static List<List<Integer>> twoSum(int[] arr, int target, int start) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		Set<Integer> s = new HashSet<>();
		
		for (int i = start; i < arr.length; ++i) {
		
			if(res.isEmpty() || res.get(res.size()-1).get(1) != arr[i]) {
				
				if(s.contains(target - arr[i])) {
					
					res.add(Arrays.asList(target - arr[i], arr[i]));
				}
			}
			
			s.add(arr[i]);
		}
		return res;
	}

}
