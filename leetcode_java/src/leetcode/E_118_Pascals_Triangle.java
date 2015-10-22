package leetcode;

import java.util.ArrayList;
import java.util.List;

public class E_118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prev =  new ArrayList<Integer>();
        
        for(int i=1; i<= numRows; i++) {
            if(i == 1) {
                prev.add(1);
                result.add(prev);
            }else {
                List<Integer> cur = new ArrayList<Integer>();
                for(int j=0; j<prev.size(); j++) {
                    if(j==0) {
                        cur.add(prev.get(j));
                    }else {
                        cur.add(prev.get(j) + prev.get(j-1));
                    }
                }
                cur.add(1);
                result.add(cur);
                prev = cur;
            }
        }
        return result;
    }
}
