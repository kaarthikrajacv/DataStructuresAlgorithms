package arrays;

public class FlipZerosForContinuous1s {

	public static void main(String[] args) {
		
		int arr[] = new int[]{0, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int m = 3;
		System.out.print("The indexes if zeros to be flipped are ");
		flipZeros(arr,m);

	}

	private static void flipZeros(int[] arr, int m) {
		
		int lW = 0, rW = 0;
		
		int bestWindow = 0, bestL = 0;
		
		int noOfZeros = 0;
		
		while(rW < arr.length) {
			if(noOfZeros<=m) {
				if(arr[rW]==0) {
					noOfZeros++;
				}
				rW++;
			}
			
			if(noOfZeros>m) {
				if(arr[lW]==0) {
					noOfZeros--;
				}
				lW++;
			}
			
			if(rW-lW>bestWindow && noOfZeros<=m) {
				
				bestWindow = rW-lW;
				bestL = lW;
			}
			
		}
		
		for (int i=0; i<bestWindow; i++) 
        { 
            if (arr[bestL+i] == 0) 
            System.out.print(bestL+i + " "); 
        }
		
	}

}
