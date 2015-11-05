package leetcode;

import java.util.Stack;

public class E_20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
        	if((c=='(' || c=='{') || c=='[') {
        		st.push(c);
        	}
        	if(c==')') {
        		if(st.isEmpty() || st.pop()!='(') return false;
        	}
        	if(c==']') {
        		if(st.isEmpty() || st.pop()!='[') return false;
        	}
        	if(c=='}') {
        		if(st.isEmpty() || st.pop()!='{') return false;
        	}
        }
        
        return st.isEmpty();
    }
}
