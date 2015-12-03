package leetcode;

import java.util.ArrayList;
import java.util.List;

public class E_228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<String>();
        
        List<String> res = new ArrayList<String>();
        
        int curIndex = 0;
        int cur = nums[0];
        while(curIndex<nums.length) {
            cur = nums[curIndex];
            int last = cur;

            String s = cur+"";
            while(curIndex+1<nums.length && nums[curIndex+1] == last + 1) {
                last = nums[curIndex+1];
                curIndex++;
            }
            if(cur != last) {
                s = s + "->" + last;
            }
            res.add(s);
            curIndex++;
            
        }
        return res;
    }

	public static void main(String args[]) {
		E_228_SummaryRanges o = new E_228_SummaryRanges();
		int[] nums = {0,1,2,4,6,7,9};
		System.out.println(o.summaryRanges(nums));
	}

}
