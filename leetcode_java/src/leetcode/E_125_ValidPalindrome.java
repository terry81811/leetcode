package leetcode;

public class E_125_ValidPalindrome {
	public boolean isPalindrome(String s) {

	//cleansing
	s = s.toLowerCase();
	s = s.replaceAll("[^A-Za-z0-9]","");

	//corner cases
	if(s.equals("")) return true;
		
		//determine half size
		int half = s.length() / 2;	//3->1, 4->2 
		char[] sArr = s.toCharArray();
	
		for(int i=0; i<half; i++) {
			if(sArr[i] != sArr[sArr.length-1-i]) return false;
		}
		return true;
	
	}
}
