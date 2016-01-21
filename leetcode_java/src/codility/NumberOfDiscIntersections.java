package codility;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[] rMP = new int[A.length];
        for(int index=0; index<A.length; index++) {
            rMP[index] = A[index]+index;
        }
        
        //sort rMP
        Arrays.sort(rMP);
        
        int count = 0;
        for(int index=0; index<A.length; index++) {
        	int l = index - A[index];
        	count = count + Arrays.binarySearch(rMP, l);
        }
		return count;
        
        
    }
    
    
    
}
