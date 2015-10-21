package leetcode;

public class E_191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
    	while(n!=0) {
        	if((n&1) == 1) {
        		count++;
        	}
        	n = n>>>1;
        }
        return count;
    }
    
    public static void main(String[] args) {
    	E_191_NumberOf1Bits o = new E_191_NumberOf1Bits();
    	System.out.println(o.hammingWeight(5));
    }
}
