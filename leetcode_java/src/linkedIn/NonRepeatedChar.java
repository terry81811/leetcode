package linkedIn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class NonRepeatedChar {
    static String nonRepeated(String s) {
    	
    	HashSet<Character> existChar = new HashSet<Character>();
    	LinkedList<Character> candidates = new LinkedList<Character>();
    	
    	for(int i=0; i<s.length(); i++) {
    		if(!existChar.contains(s.charAt(i))) {
    			existChar.add(s.charAt(i));
    			candidates.add(s.charAt(i));
    		}else {
    			if(candidates.contains(s.charAt(i))) {
    				candidates.remove((Character)s.charAt(i));
    			}
    		}
    	}
    	char c = (char) candidates.getFirst();
		return c+"";
    }
    
    public static void main(String[] args) {
    	nonRepeated("mnonmpsms");
    }
}
