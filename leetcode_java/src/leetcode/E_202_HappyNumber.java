package leetcode;

import java.util.HashMap;

public class E_202_HappyNumber {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        HashMap<Integer, Boolean> numbers = new HashMap<Integer, Boolean>();
        
        int cur = n;
        while(cur!=1) {
            if(numbers.containsKey(cur)) return false;
            numbers.put(cur, true);

            int sum = 0;
            while(cur != 0) {
            	int res = cur%10;
                sum = sum + res * res;
                cur = cur/10;
            }
            cur = sum;
        }   
        
        return true;
    }
    
    public static void main(String args[]) {
    	E_202_HappyNumber o = new E_202_HappyNumber();
    	o.isHappy(7);
    }
    
}
