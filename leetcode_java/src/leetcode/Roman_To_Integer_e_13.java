package leetcode;

import java.util.Hashtable;

public class Roman_To_Integer_e_13 {
    public int romanToInt(String s) {
    	
    	Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
    	h.put('M', 1000);
    	h.put('D', 500);
    	h.put('C', 100);
    	h.put('L', 50);
    	h.put('X', 10);
    	h.put('V', 5);
    	h.put('I', 1);
    	
    	int sum = 0;
    	char current = ' ';
    	
    	char[] input = s.toCharArray();
    	current = input[0];
    	sum += h.get(input[0]);

    	for(int i=1; i<input.length; i++) {
    		sum+=h.get(input[i]);
    		if(h.get(input[i]) > h.get(current)){
    			sum = sum - 2*h.get(current);
    		}
			current = input[i];
    		System.out.println(sum);
    	}
    	
    	return sum;   
    }
    
    public static void main(String[] args) {
    	Roman_To_Integer_e_13 o = new Roman_To_Integer_e_13();
    	System.out.println(o.romanToInt("MCMXCVI"));
    }
    
}
