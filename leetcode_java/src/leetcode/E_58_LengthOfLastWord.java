package leetcode;

public class E_58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
    	if(s.length() == 0) return 0;
        String[] parts = s.split(" ");
        if (parts.length == 0) return 0;
        return parts[parts.length-1].length();
    }
}
