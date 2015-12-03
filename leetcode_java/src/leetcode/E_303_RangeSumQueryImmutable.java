package leetcode;

public class E_303_RangeSumQueryImmutable {
    private int[] sumArr;
    
    public E_303_RangeSumQueryImmutable(int[] nums) {
        sumArr = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            this.sumArr[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if(i<=0) return this.sumArr[j];
        if(j>this.sumArr.length) return this.sumArr[j] - this.sumArr[i-1];
        else return this.sumArr[j] - this.sumArr[i-1];
    }
}
