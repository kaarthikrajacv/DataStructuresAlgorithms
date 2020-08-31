package arrays;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeElementsSumZero {

	public static void main(String[] args) throws MalformedURLException{
		
		 int arr[] = {-1,0,1,2,-1,-4};
		
		List<List<Integer>> op11 = findTripletsOfSumZero(arr);
		
		System.out.println("The Triplets are " + op11);

	}

	private static List<List<Integer>> findTripletsOfSumZero(int[] arr) {
		
		List<List<Integer>> op = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			
			int l = i+1, r=arr.length-1, x=arr[i];
			
			while(l<r) {
				
				if(arr[l]+arr[r]+x == 0) {
					
					op.add(Arrays.asList(arr[l],arr[r],x));
					l++;
					r--;
				}else if(arr[l]+arr[r]+x < 0) {
					l++;
				}else {
					r--;
				}
				
				
				
			}
			
		}
		System.out.println(op.stream().distinct().collect(Collectors.toList()));
		
		return op.stream().distinct().collect(Collectors.toList());
	}
	
}
