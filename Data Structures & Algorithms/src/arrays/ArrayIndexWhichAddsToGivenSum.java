package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayIndexWhichAddsToGivenSum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,9,11};
		int target = 9;    
		System.out.println(new ArrayIndexWhichAddsToGivenSum().twoSum(nums, target));

	}
	
	
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(m.containsKey(target-nums[i])){
               result[0] = m.get(target-nums[i]);
               result[1] = i; 
               break;
            }
            m.put(nums[i], i);
            
        }
        return result;
    }

}
