package arrays;

public class MaximumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solve the maximum contiguous sub array using kadane's algorithm
		// Here you have to find the maximum sum in any given sub array
		
		int[] array = {30, -3, -4, -1, 2, -1, 1};
		
		int value  = kadanesAlgorithm(array);
		
		System.out.println("The maximum contiguous sub array is " + value);
	}

	private static int kadanesAlgorithm(int[] array) {
		// TODO Auto-generated method stub
		int a = Integer.MIN_VALUE;
		int b = 0;
		
		for (int i=0; i<array.length; i++) {
			
			b = b + array[i];
			
			if(a<b) {
				a=b;
			}
			if(b<0) {
				b=0;
			}
		}
		
		
		return a;
	}

}
