package leetcode;

public class E_231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        while(n != 0) {
            if(n == 2) return true;
            if(n%2 != 0) return false;
            n = n/2;
        }
        return true;
    }
}
