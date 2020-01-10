package arrays;

public class WaterBlocks {

	public static void main(String[] args) {
		
		int arr[] = { 3,2,2,2,0,5,0,3}; 
		int n = arr.length; 

		System.out.println("Maximum water that "+ "can be accumulated is "+ findWater(arr, n));
		
		
	}
	
	
	static int findWater(int arr[], int n) 
    { 
        // initialize output 
        int result = 0; 
  
        // maximum element on left and right 
        int left_max = 0, right_max = 0; 
  
        // indices to traverse the array 
        int lo = 0, hi = n - 1; 
  
        while (lo <= hi) { 
            if (arr[lo] < arr[hi]) { 
                if (arr[lo] > left_max) 
  
                    // update max in left 
                    left_max = arr[lo]; 
                else
  
                    // water on curr element = 
                	// max - curr 
                    result += left_max - arr[lo]; 
                lo++; 
            } 
            else { 
                if (arr[hi] > right_max) 
  
                    // update right maximum 
                    right_max = arr[hi]; 
  
                else
                    result += right_max - arr[hi]; 
                hi--; 
            } 
        } 
  
        return result; 
    } 
	
}
