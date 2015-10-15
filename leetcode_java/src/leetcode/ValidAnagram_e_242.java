package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram_e_242 {
    public boolean isAnagram(String s, String t) {
        int[] ct = new int[26];
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;
        else {
            for(int i=0; i<s.length(); i++) {
                ct[s.charAt(i) - 'a']++;
            }
            for(int i=0; i<t.length(); i++) {
                ct[t.charAt(i) - 'a']--;
                if(ct[t.charAt(i) - 'a']<0) {
                	return false;
                }
            }
            return true;

        }
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
