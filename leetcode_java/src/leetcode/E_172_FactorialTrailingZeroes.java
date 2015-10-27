package leetcode;

public class E_172_FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        int x = n;
        int max5 = 0;
        while(x / 5 > 0){
            x = x/5;
            max5++;
        }
        for(int i=1; i<=max5; i++) {
            count = (int) (count + n/Math.pow(5,i));
        }
        return count;
    }
}

