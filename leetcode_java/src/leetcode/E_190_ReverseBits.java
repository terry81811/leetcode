package leetcode;

public class E_190_ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        
        for(int i = 0; i<32; i++) {
            result = result << 1;
            if((n&1) == 1) {
                result = result + 1;
            }

            n = n >>> 1;
        }
        return result;
    }
    public static void main(String args[]) {
    	E_190_ReverseBits o = new E_190_ReverseBits();
    	o.reverseBits(4);

    }
}

// bitwise operator!!