package arrays;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {13,23};
		int[] nums2 = {2,4,7,8};
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        List<Integer> li = new ArrayList<>();
        int i=0,j=0;
        
        while(i<nums1.length || j<nums2.length){
            if(i <nums1.length){
                if(j<nums2.length){
                    if(nums1[i]<=nums2[j]){
                        li.add(nums1[i]);
                        i++;
                    }else{
                        li.add(nums2[j]);
                        j++;
                    }
                }else {
                	li.add(nums1[i]);
                    i++;
                }
            }else if(j<nums2.length) {
            	li.add(nums2[j]);
                j++;
            }
            
        }
        
        if(li.size()%2 != 0) {
        	return li.get((li.size() -1)/2);
        }else {
        	int median = li.size()/2;
        	 return (li.get(median) + li.get(median-1))/2.0;
        	
        }
        
    }

/*
 * Alternative solution using FOr Loop.....
 */
public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
    int[] buf = new int[nums1.length + nums2.length];
    int item1 = 0, item2 = 0;
    for(int i = 0 ; i < nums1.length + nums2.length ; i++){
        if(item1 < nums1.length && item2 < nums2.length){
            if(nums1[item1] < nums2[item2]){
                buf[i] = nums1[item1++];
            } else if(nums1[item1] > nums2[item2]){
                buf[i] = nums2[item2++];
            } else if(nums1[item1] == nums2[item2]){
                buf[i++] = nums1[item1++];
                buf[i] = nums2[item2++];
            }
        } else if(item1 == nums1.length && item2 < nums2.length){
            buf[i] = nums2[item2++];
        } else if(item2 == nums2.length && item1 < nums1.length){
            buf[i] = nums1[item1++];
        }
    }
    if(buf.length%2 ==0){
        return (double) (buf[buf.length/2] + buf[buf.length/2-1])/2;
    } else {
        return (double) buf[buf.length/2];
    }
}

}
