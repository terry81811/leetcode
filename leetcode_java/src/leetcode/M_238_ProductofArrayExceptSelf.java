package leetcode;

import java.util.Arrays;

public class M_238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
    	int[] results = new int[nums.length];
    	
    	int product = 1;
    	int zeroCount = 0;
    	int zeroIndex = -1;
    	
    	for(int i=0; i<nums.length; i++) {
    	    if(nums[i]==0) {
    	        zeroIndex = i;
    	        zeroCount++;    	    	
    	    }
    	    if(nums[i]!=0)
        		product = product * nums[i];
    	}
    	
    	if(zeroCount > 1)
    	    Arrays.fill(results, 0);
    	else if(zeroCount == 1) {
        	Arrays.fill(results, 0);
    	    results[zeroIndex] = product;
    	    
    	}else {
        	Arrays.fill(results, product);
        	for(int j=0; j<results.length; j++) {
        	    if(nums[j] != 0) 
        	        results[j] = results[j]/nums[j];
        	}
    	}

		return results;
    }
    
    public static void main(String[] args) {
    	M_238_ProductofArrayExceptSelf o = new M_238_ProductofArrayExceptSelf();
    	int[] arr = {1,0};
    	o.productExceptSelf(arr);
    	System.out.println();
    }
}
