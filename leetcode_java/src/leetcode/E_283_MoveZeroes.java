package leetcode;

public class E_283_MoveZeroes {
    public void moveZeroes(int[] nums) {
    	int numberOfZeros = 0;
    	for(int index = 0; index+numberOfZeros<nums.length; index++) {
    		if(nums[index] == 0){
        		while(index+numberOfZeros<nums.length && nums[index+numberOfZeros] == 0) {
        			numberOfZeros++;
        		}
        		if(index+numberOfZeros<nums.length) {
            		this.swap(index, numberOfZeros, nums);        			
        		}
    		}	
    	}
    }
    
    public void swap(int index, int n, int[] nums) {
    		int temp = nums[index];
    		nums[index] = nums[index+n];
    		nums[index+n] = temp;
    }
    
    
    //better solution
    public void moveZeroes2(int[] nums) {
        int count = 0; 
        for (int i=0; i<nums.length;i++) { 
            if (nums[i] == 0) count++;
            else nums[i-count] = nums[i]; //if nonzero move left x spaces, where x = 0's so far
        }
        for (int j=0;j<count;j++) {
            nums[nums.length-1-j] = 0; //tack on zeros at the end
        } 
    }
    
    //other solution
        public void moveZeroes3(int[] nums) {
            int read = 0;
            int write = 0;
            while(read < nums.length){	//write will always stop at the first zero
                if(nums[read] == 0){
                    read++;
                }
                else{
                    nums[write] = nums[read];
                    read++;
                    write++;
                }
            }
            for(int i=write; i <nums.length ; i++){
                nums[i] = 0 ;
            }
        }
    
    
	public static void main(String[] args) {
		E_283_MoveZeroes o = new E_283_MoveZeroes();
		int[] nums = {0,0,1,3,0,2,0};
		o.moveZeroes(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		
	}
    
}
