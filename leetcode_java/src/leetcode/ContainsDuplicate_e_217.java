package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate_e_217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        
        for(int i=0; i<nums.length; i++) {
        	if(prev==nums[i] && i !=0) {
        		return true;
        	}
        	prev = nums[i];
        }
		return false;
    }

    //using hash
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for( int i : nums){
            set.add(i);
        }
        return set.size() < nums.length ? true : false;
    }

}
