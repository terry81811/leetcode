package leetcode;

public class E_171_ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int num = 0;
        char[] cArray = s.toCharArray();
        for(int i=cArray.length - 1; i>=0; i--) {
            num += Math.pow(26, cArray.length - 1 - i) * ((int)cArray[i] - 64);   		
        }
		return num;
    }
	
	
	public static void main(String[] args) {
		E_171_ExcelSheetColumnNumber o = new E_171_ExcelSheetColumnNumber();
		System.out.println(o.titleToNumber("AA"));
	}
	
}

