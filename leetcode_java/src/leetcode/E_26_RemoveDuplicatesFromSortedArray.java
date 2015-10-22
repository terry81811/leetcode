package leetcode;

public class E_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
    	if(nums.length<=1) return nums.length;
    	int cur = nums[0];
    	int begin = 0;
    	for(int i = 1; i<nums.length; i++) {
    		if(nums[i] > cur) {
    			begin++;
    			nums[begin] = nums[i];
    			cur = nums[i];
    		}
    	}
    	return begin+1;
        
    }
    
    public static void main(String args[]) {
    	E_26_RemoveDuplicatesFromSortedArray o = new E_26_RemoveDuplicatesFromSortedArray();
    	int[] arr = {1,1,1,1};
    	o.removeDuplicates(arr);
    	System.out.println(o.removeDuplicates(arr));
    }
}
