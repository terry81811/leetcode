package leetcode;

import java.util.HashMap;

public class E_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        HashMap<Character, Character> hmReverse = new HashMap<Character, Character>();
        
        for(int i=0; i<sArr.length; i++) {
        	if(!hm.containsKey(sArr[i])) {
        	   if(hmReverse.containsKey(tArr[i])) return false;
        		hm.put(sArr[i], tArr[i]);
        		hmReverse.put(tArr[i], sArr[i]);
            }else {
            	if(hm.get(sArr[i]) != tArr[i]) return false;
            	if(hmReverse.get(tArr[i]) != sArr[i]) return false;
            }
        }
        return true;
    
    }
}
