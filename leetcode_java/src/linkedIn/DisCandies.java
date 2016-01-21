package linkedIn;

import java.util.Arrays;

public class DisCandies {
    static int minUnfairness(int k, int[] arr) {
        //corner cases
        if(arr.length < k) return 0;
        Arrays.sort(arr);

        int unfair = Integer.MAX_VALUE;
        
        for(int j = 0; k + j - 1< arr.length; j++) {
        	if(arr[k+j-1] - arr[j] < unfair) {
        		unfair = arr[k+j-1] - arr[j];
        	}
        }
        System.out.println(unfair);
		return unfair;
    }
    
    public static void main(String[] args) {
    	int[] arr = {10,1,2,3,4,10,20,30,40,100,200,300,400};
    	DisCandies o = new DisCandies();
    	minUnfairness(14, arr);
    }
}
