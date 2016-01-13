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
}
