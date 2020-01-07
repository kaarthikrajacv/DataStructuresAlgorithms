package arrays;

public class Sort0s1s2s_Dutch_National_Flag_Algorithm {
	
	static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
    /*Driver function to check for above functions*/
    public static void main(String[] args) 
    { 
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation "); 
        printArray(arr, arr_size); 
    }

	private static void sort012(int[] arr, int arr_size) {
		
		int low = 0;
		int mid = 0;
		int high = arr_size-1;
		int temp=0;
		
		while(mid<=high) {
			switch(arr[mid]) {
			
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
		}
		
	}
    
    

}
