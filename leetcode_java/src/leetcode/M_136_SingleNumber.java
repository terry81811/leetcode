package leetcode;

import java.util.HashSet;

public class M_136_SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i: nums) {
            if(hs.contains(i)) hs.remove(i);
            else hs.add(i);
        }
        Object[] myArr = hs.toArray();
        return (int)myArr[0];
    }
    
    //bitwise operation
    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;	//exclusive OR
        }
        return result;
    }
}
