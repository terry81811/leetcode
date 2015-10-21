package leetcode;

public class E_70_ClimbingStairs {
    public int climbStairs(int n) {
        if(n==0) {
            return 0;
        }else if(n==1) {
            return 1;
        }else if(n==2) {
            return 2;
        }else {
            int[] stairs = new int[n];
            stairs[0] = 1;
            stairs[1] = 2;
            for(int i=2; i<n; i++) {
                stairs[i] = stairs[i-1] + stairs[i-2];
            }
            return stairs[n-1];            
        }
    }
}
