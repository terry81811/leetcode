package leetcode;

public class E_189_RotateArray {
    public void rotate(int[] nums, int k) {
        //first attempt, use additional space = n array
        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
        	System.out.println((i+k)%nums.length+", "+i);
            res[(i+k)%nums.length] = nums[i];
        }
        nums = res;
        for(int i : nums) {
        	System.out.println(i);
        }
    }

    
//    reverse segments and then reverse the whole
//    The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, 
//    first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], 
//    it becomes[7,6,5], finally we reverse the array as a whole, 
//    it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].
    public void rotate2(int[] nums, int k) {

        if(nums == null || nums.length < 2){
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    private void reverse(int[] nums, int i, int j){
        int tmp = 0;       
        while(i < j){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
    
    
    public static void main(String args[]) {
    	E_189_RotateArray o = new E_189_RotateArray();
    	int[] nums = {1,2};
    	o.rotate(nums, 1);
    }
}
