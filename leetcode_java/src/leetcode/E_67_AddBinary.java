package leetcode;

import java.util.Arrays;

public class E_67_AddBinary {
	public String addBinary(String a, String b) {
		String res = "";
		
		if(a.length()<b.length()){
			char[] temp = new char[b.length()-a.length()];
			Arrays.fill(temp, '0');
			a = new String(temp)+a;
		}else if(a.length()>b.length()){
			char[] temp = new char[a.length()-b.length()];
			Arrays.fill(temp, '0');
			b = new String(temp)+b;
		}
		
		int aIndex = a.length()-1;
		int bIndex = b.length()-1;
		int overflow = 0;

		while(aIndex >= 0 && bIndex >= 0) {
			
			switch(Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(
b.charAt(bIndex)) + overflow) {
				case 0:
					System.out.println("hii");
					res = 0+res;
					overflow = 0;
					break;
				case 1:
					System.out.println("hi");
					res = 1+res;
					overflow = 0;
					break;
				case 2:
					System.out.println("h");
					res = 0+res;
					overflow = 1;
					break;
				case 3:
					res = 1+res;
					overflow = 1;
					break;
				}
				aIndex --;
				bIndex --;
			}
			if(overflow == 1) return 1+res;
		return res.equals("") ? "0" : res;
	
	}
	
//	this is better,
//	1. make b.length always > a.length,
//	2. loop through b, if exceed a.length, always return 0 for a
	public String addBinary2(String a, String b) {

        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;
        if(a.length() > b.length()) return addBinary(b,a);

        StringBuilder sb = new StringBuilder();
        char carry = '0';

        for(int i = 0; i < b.length(); i++){
            char aChar = i < a.length() ? a.charAt(a.length()-1-i) : '0';
            char bChar = b.charAt(b.length()-1-i);
            char curr;

            if(aChar != bChar){
                curr = carry == '1'? '0' :'1';
            }else{
                curr = carry;
                carry = aChar;
            }

            sb.insert(0,curr);
        }

        if(carry == '1') sb.insert(0,carry);
        return new String(sb);
    }
	
	public static void main(String[] args) {
		E_67_AddBinary o = new E_67_AddBinary();
		System.out.println(o.addBinary("11", "1"));
	}
}
