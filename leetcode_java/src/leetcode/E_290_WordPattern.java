package leetcode;

import java.util.HashMap;

public class E_290_WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        char[] patternParts = pattern.toCharArray();
        String[] strParts = str.split(" ");
        if(patternParts.length != strParts.length) return false;
        
        for(char c: patternParts) {
        	System.out.println(c);
        }
        
        for(String s: strParts) {
        	System.out.println(s);
        }
        
        HashMap<Character, String> hm = new HashMap<Character, String>();
        HashMap<String, Character> hmRev = new HashMap<String, Character>();

        for(int i=0; i<patternParts.length; i++) {
            if(hm.containsKey(patternParts[i]) && hmRev.containsKey(strParts[i])) {
                if(!hm.get(patternParts[i]).equals(strParts[i])) return false;
                if(!hmRev.get(strParts[i]).equals(patternParts[i])) return false;
            }else if(hm.containsKey(patternParts[i]) || hmRev.containsKey(strParts[i])) {
            	return false;
            }	
            else{            	
                hm.put(patternParts[i], strParts[i]);
                hmRev.put(strParts[i], patternParts[i]);
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
    	E_290_WordPattern o = new E_290_WordPattern();
    	o.wordPattern("abba", "dog cat cat dog");
    }
}
