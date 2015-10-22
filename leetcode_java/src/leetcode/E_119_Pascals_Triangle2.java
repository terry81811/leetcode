package leetcode;

import java.util.ArrayList;
import java.util.List;

public class E_119_Pascals_Triangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        for(int i = 1; i<=rowIndex; i++) {
            int prev = 0;
            for(int j = 0; j<result.size(); j++) {
                int temp = result.get(j);
                result.set(j,result.get(j) + prev);
                prev = temp;
            }
            result.add(1);
        }
        return result;
    }
}
