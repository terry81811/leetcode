package leetcode;

public class NumberOf1Bits_e_191 {
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
    	NumberOf1Bits_e_191 o = new NumberOf1Bits_e_191();
    	System.out.println(o.hammingWeight(5));
    }
}
