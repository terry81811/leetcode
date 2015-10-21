package leetcode;

public class E_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end) {
            if(nums[start] == val) {
                while(nums[end] == val) {
                	if(start == end) return start;
                    end --;
                }
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            start++;
        }

        return start;
    }
    
    public static void main(String[] args) {
    	E_27_RemoveElement o = new E_27_RemoveElement();
    	int[] arr = {1};
    	o.removeElement(arr, 1);
    }
}
