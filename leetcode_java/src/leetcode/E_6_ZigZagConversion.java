package leetcode;

import java.util.Arrays;

public class E_6_ZigZagConversion {
	public String convert(String s, int Rows) {
		
		//corner case
		if(s == null) return null;
		if(s.equals("")) return "";
		if(Rows<=1) return s;
		if(s.length()<=Rows) return s;
		
		StringBuilder sb = new StringBuilder();

		//init results to empty string for each rows;
		String[] resArr = new String[Rows];
		Arrays.fill(resArr, "");
		
		for(int i=0; i<s.length(); i++) {
			if(i%((Rows-1)*2) > Rows-1 ) {
				resArr[(Rows-1)*2 - i%((Rows-1)*2)] += s.charAt(i);
			}
			else{
				resArr[i%((Rows-1)*2)] += s.charAt(i);
			}
		}
			
		for(String str:resArr) {
			sb.append(str);
		}
		return sb.toString();	
	}
}
