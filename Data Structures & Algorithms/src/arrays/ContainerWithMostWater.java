package arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int [] height = {1,8,3,4,6,2,9};
		
		int op = findMaximumWater(height);
		
		System.out.println("The maximum capacity is " + op);
		

	}

	private static int findMaximumWater(int[] height) {
		
		int left=0;
        int right = height.length-1;
        int maxArea = 0;
        
        while(left<right){
            maxArea = Math.max(maxArea, Math.min(height[left],height[right])*(right-left));
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return maxArea;
	}

}
