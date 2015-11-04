package leetcode;

import java.util.HashMap;

public class E_219_ContainsDuplicate2 {
	
	
	//time limit exceed, O(N^2)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1) return false;
        if(k>=nums.length) k = nums.length - 1;
        
        for(int i=0; i+k<nums.length; i++) {
        	System.out.println("checking: "+nums[i]);
            HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
            hm.put(nums[i], true);
            for(int j=1; j<=k; j++) {
            	System.out.println("find: "+nums[i]+ ">>> "+nums[i+j]);
                if(hm.containsKey(nums[i+j])) return true;
            }
        }
        return false;
    }
    
    //better solution, use hash value to store the index and compare i-j <=k in loop
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        if(nums.length<=1) return false;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                if(i - hm.get(nums[i]) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
            
        }
        return false;
    }
    
    public static void main(String args[]) {
    	E_219_ContainsDuplicate2 o = new E_219_ContainsDuplicate2();
    	int[] arr = {99,99};
    	o.containsNearbyDuplicate(arr, 2);
    }
}
