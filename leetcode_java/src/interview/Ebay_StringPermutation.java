package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ebay_StringPermutation {
	public List<String> permute (String s) {
		List<String> result = new ArrayList<String>();

		if(s.toCharArray().length == 1) {
			result.add(s);
			return result;
		}
		else {
			List<Character> cur = new ArrayList<Character>();
			
			char[] charArray = s.toCharArray();
			
			for(int i = 0; i<charArray.length; i++) {
				
				char c = charArray[i];	//the fixed character
				
				String rest = "";	//the rest substring
				for(int j = 0; j<charArray.length; j++) {
					if(j!=i) rest = rest + charArray[j];
				}
				
				List<String> substrings = permute(rest);	//recursive call here
				for(String substring: substrings) {	//add c+substring for every permutations of substring
					result.add(c+substring);
				}
				
			}
			return result;
		}		
	}

	public static void main(String args[]) {
		Ebay_StringPermutation o = new Ebay_StringPermutation();
		List<String> out = o.permute("abcd");
		for(String s : out) {
			System.out.println(s);
		}
	}
}
