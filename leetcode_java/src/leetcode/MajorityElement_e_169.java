package leetcode;

import java.util.Hashtable;

public class MajorityElement_e_169 {

	
    public int majorityElement(int[] nums) {
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		int maxCount = 0;
		int maxInt = 0;
    	for(int i = 0; i<nums.length; i++) {
    		if(h.containsKey(nums[i])){
    			h.replace(nums[i], h.get(nums[i]) + 1);
    			if(h.get(nums[i]) > maxCount) {
    				maxCount = h.get(nums[i]);
    				maxInt = nums[i];
    			}
    		}else{
    			h.put(nums[i], 1);
    			if(1>maxCount) {
    				maxCount = 1;
    				maxInt = nums[i];
    			}
    		}
    	}
		
    	return maxInt;
    }

    //better solution
    public int majorityElement2(int[] nums) {

        int count = 0, val = 1;
        for (int num : nums) {
            if (num == val)
                count++;
            else if (count == 0) {
                val = num;
                count = 1;
            } else
                count--;
        }
        return val;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
