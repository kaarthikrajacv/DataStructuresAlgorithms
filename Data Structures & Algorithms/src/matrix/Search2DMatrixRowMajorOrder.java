package matrix;

public class Search2DMatrixRowMajorOrder {

	public static void main(String[] args) {
		
		int matrix[][] = { { 1, 3, 5, 7 }, 
			                { 10, 11, 16, 20 }, 
			                { 23, 30, 34, 50 } };
		
		System.out.println(matrix.length);
		
		
		int K = 51; 
        if (searchMatrix(matrix, K)) { 
            System.out.println("Found"); 
        } 
        else { 
            System.out.println("Not found"); 
        }

	}

	private static boolean searchMatrix(int[][] matrix, int k) {
		
		int i=0,j=0;
		int row = matrix.length;
		int col = matrix[0].length-1;
		j=col;
		
		while(i<=row && j>=0) {
				if(matrix[i][j]==k) {
					return true;
				}
				
				if(matrix[i][j] >k) {
					if(j<0) {
						return false;
					}
					j--;
				}
				
				else if(matrix[i][j]<k) {
					if(i==row-1) {
						return false;
					}
					i++;
				}
		}
	
	
		
		
		
		
		return false;
	}

}
