package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class E_299_BullsandCows {
	public String getHint(String secret, String guess) {

		//compute A

		char[] secretArr = secret.toCharArray();
		char[] guessArr = guess.toCharArray();
		ArrayList<Character> leftGuess = new ArrayList<Character>();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		int countA = 0;
		for(int i=0; i<secretArr.length; i++) {
			if(secretArr[i] == guessArr[i]) countA++;
			else {
				if(hm.containsKey(secretArr[i])){
					hm.put(secretArr[i], hm.get(secretArr[i])+1);
				}else{
					hm.put(secretArr[i], 1);
				}
				leftGuess.add(guessArr[i]);
			}
		}
		
		//compute B
		int countB = 0;
		for(int j=0; j<leftGuess.size(); j++) {
			if(hm.containsKey(leftGuess.get(j))) {
				if(hm.get(leftGuess.get(j)) != 0) {
					hm.put(leftGuess.get(j), hm.get(leftGuess.get(j)) - 1);
					countB ++;
				}
			}
		}

		//print result
		return countA+"A"+countB+"B";
	}
	
	
	//within one loop, use int[10] to indicate 0-9 numbers, time: O(n), place:O(1)
	public String getHint2(String secret, String guess) {
	    int a=0,b=0;
	    int[] digits=new int[10];
	    for(int i=0;i<secret.length();i++){
	        if(secret.charAt(i)==guess.charAt(i)) a++;
	        else{
	            if(++digits[secret.charAt(i)-'0']<=0) b++;
	            if(--digits[guess.charAt(i)-'0']>=0) b++;
	        }
	    }
	    return a+"A"+b+"B";
	}
	
	public static void main(String[] args) {
		E_299_BullsandCows o = new E_299_BullsandCows();
		System.out.println(o.getHint("1122", "2211"));
	}

}
