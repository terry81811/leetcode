package leetcode;

public class M_318_MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
        int[] leng = new int[words.length];
    	int[] marks = new int[words.length];
    	
    	
//    	for(int i=0; i<leng.length; i++) {
//    		leng[i] = words[i].length();
//    	}
//    	
    	for(int i=0; i<marks.length; i++) {
    		int bits = 0;
    		for(int j=0; j<words[i].length(); j++) {
    			bits = bits | 1 << (words[i].charAt(j) - 'a');
    		}
    		marks[i] = bits;
    	}
    	
    	int max = 0;
    	for(int i=0; i<marks.length; i++) {
    		for(int j=0; j<marks.length; j++) {
    			if((marks[i] & marks[j]) == 0) {
    				if(words[i].length() * words[j].length() > max)
    					max = words[i].length() * words[j].length();
    			}
    		}
    	}
    	
		return max;
        
    }
}
