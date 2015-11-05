package leetcode;

public class E_14_LongestCommonPrefix {
	public String longestPrefix(String[] strs) {

		if(strs.length == 0) return "";
		
		int min = 1000000;
		for(String str: strs) {
		  min = Math.min(min, str.length());
		}

		if(min ==0) return "";

		String s ="";
		for(int i=0; i<min; i++) {
			char c = strs[0].charAt(i);
			for(int j=1; j<strs.length; j++) {
				if(strs[j].charAt(i) != c) {
					return s;
				}
			}
			s = s+c;
		}
		return s;
	}
}
