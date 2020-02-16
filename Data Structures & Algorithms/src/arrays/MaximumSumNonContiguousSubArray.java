package arrays;

public class MaximumSumNonContiguousSubArray {

	public static void main(String[] args) {
		
		int[] array = {5,1,1,5};
		
		int output = findNonContiguousSum(array);
		
		System.out.println("Maximum non contiguous sum is " + output);

	}

	private static int findNonContiguousSum(int[] array) {
		
		int inclusive = 0;
		int exclusive = 0;
		int prevInclusive = 0;
		
		for(int i=0;i<array.length;i++) {
			prevInclusive = inclusive;
			inclusive  = exclusive + array[i];
			exclusive = Math.max(prevInclusive, exclusive);
		}
		
		return Math.max(inclusive, exclusive);
	}

}
