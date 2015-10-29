package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E_36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<board.length; i++) {
        	List<Character> listA = new ArrayList<Character>();
        	List<Character> listB = new ArrayList<Character>();
        	
        	for(int j = 0; j<board.length; j++) {
            	listA.add(board[i][j]);
            	listB.add(board[j][i]);
            }
        	if(!this.isValidSet(listA)) return false;
        	if(!this.isValidSet(listB)) return false;
        }
        for(int l=0; l<3; l++) {
        	int indexA = l * 3;        
	        for(int m=0; m<3; m++) {
	        	int index = m * 3;
	        	List<Character> listC = new ArrayList<Character>();        	
	        	for(int n=0; n<3; n++) {
	        		for(int o=0; o<3; o++) {
	        			if(board[indexA+n][index+o] != '.') {
	        				System.out.println(board[indexA+n][index+o]);
	        			}
	    				System.out.println("["+(indexA+n)+","+(index+o)+"] ");
	        			listC.add(board[indexA+n][index+o]);
	        		}
	        	}
	        	if(!this.isValidSet(listC)) return false;
	        }
        }
        
        
        return true;
    }

    public boolean isValidSudoku2(char[][] board) {

        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] block = new boolean[9][9];

        for(int i = 0;i<9;i++){
            for(int j=0;j<9;j++){
                 int c = board[i][j] - '1';       
                 if(board[i][j]=='.'){
                     continue;
                 }
                 if(row[i][c]||column[j][c]||block[i - i % 3 + j / 3][c]){
                     return false;
                 }
                 row[i][c] = column[j][c] = block[i - i % 3 + j / 3][c] = true;
            }
        }
        return true;
     }
    
    public boolean isValidSet(List<Character> list) {
    	HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
    	for(Character c : list) {
    		if(hm.containsKey(c)) {
    			return false;
    		}else if(!c.equals('.')) {
        		hm.put(c, true);    			
    		}
    	}
		return true;
    }
}

//we can use array to store flags and compare like a hash

//....5..1.
//.4.3.....
//.....3..1
//8......2.
//..2.7....
//.15......
//.....2...
//.2.9.....
//..4......
