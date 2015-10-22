package leetcode;

public class E_198_House_Robber {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        else {
            nums[2] = nums[2] + nums[0];
            for(int i = 3; i<nums.length; i++) {
                nums[i] = Math.max(nums[i]+nums[i-3], nums[i]+nums[i-2]);
            }
            return Math.max(nums[nums.length-1], nums[nums.length-2]);
        }    
        
    }
}
