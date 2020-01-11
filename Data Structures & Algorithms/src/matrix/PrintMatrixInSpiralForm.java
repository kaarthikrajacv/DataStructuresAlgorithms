package matrix;

public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {
		
		int R = 3; 
        int C = 6; 
        int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
                      { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
        spiralPrint(R, C, a);

	}

	public static void spiralPrint(int r, int c, int[][] a) {
		
		int startRowIndex=0,startColIndex=0;
		
		while(startRowIndex<r && startColIndex<c) {
			
			for(int i=startColIndex;i<c;++i) {
				System.out.print(a[startRowIndex][i] + " ");
			}
			startRowIndex++;
			
			for(int i=startRowIndex;i<r;++i) {
				System.out.print(a[i][c-1] + " ");
			}
			c--;
			
			if(startRowIndex<r) {
				for(int i=c-1;i>=startColIndex;--i) {
					System.out.print(a[r-1][i] + " ");
				}
				r--;
			}
			if(startColIndex<c) {
				for(int i=r-1;i>=startRowIndex;--i) {
					System.out.print(a[i][startColIndex] + " ");
				}
				startColIndex++;
			}
		}
		
		
	
	}

}
