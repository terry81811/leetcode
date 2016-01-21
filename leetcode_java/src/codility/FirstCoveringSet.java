package codility;
import java.util.*;

public class FirstCoveringSet {
	// you can also use imports, for example:
	// import java.util.*;
	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        if(A.length == 0) return -1;
	        if(A.length == 1) return 0;
	        
	        HashSet<Integer> hs = new HashSet<Integer>();
	        
	        for(int i: A) {
	            if(!hs.contains(i)) hs.add(i);
	        }
	        for(int index = 0; index < A.length; index++) {
	            if(hs.size() == 0) return index-1;
	            
	            if(hs.contains(A[index])) hs.remove(A[index]);
	            
	        }
	        return A.length-1;
	        
	    }
}
