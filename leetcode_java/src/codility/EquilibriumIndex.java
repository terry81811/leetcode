package codility;

public class EquilibriumIndex {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        //corner case
	        if(A.length == 0) return -1;
	        if(A.length == 1) return 1;
	        
	        int sum = 0;
	        for(int i: A) {
	            sum = sum + i;
	        }
	        
	        int partialSum = 0;
	        for(int index =0; index<A.length; index++) {
	            if(partialSum == (sum - partialSum - A[index])) return index;
	            partialSum = partialSum + A[index];
	        }
	        
	        return -1;
	}
	
	
}
