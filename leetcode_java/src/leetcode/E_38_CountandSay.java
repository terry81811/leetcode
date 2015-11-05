package leetcode;

public class E_38_CountandSay {
    public String countAndSay(int n) {
        String s = "1";
    	for(int i=1; i<n; i++) {
    		s = this.helper(s);
    	}
    	return s;
    }
    
    public String helper(String s) {

    	if (s.length() == 0) return "";

    	char[] cArr= s.toCharArray(); 
    	String output = "";
    	
    	int count = 1;
    	char c = cArr[0];

    	for(int i=1; i<s.length(); i++) {
    		if(cArr[i] == c) {
    			count++;
    		}else{
    			output = output + count + c;
    			c = cArr[i];
    			count = 1;
    		}
    	}
    	
    	output = output + count + c;
    	
    	return output;
    	
    }
    
    public static void main(String[] args) {
    	E_38_CountandSay o = new E_38_CountandSay();

    	System.out.println(o.helper("1211"));
    }
}
