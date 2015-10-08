package leetcode;

public class ExcelSheetColumnNumber_e_171 {

    public int titleToNumber(String s) {
        int num = 0;
        char[] cArray = s.toCharArray();
        for(int i=cArray.length - 1; i>=0; i--) {
            num += Math.pow(26, cArray.length - 1 - i) * ((int)cArray[i] - 64);   		
        }
		return num;
    }
	
	
	public static void main(String[] args) {
		ExcelSheetColumnNumber_e_171 o = new ExcelSheetColumnNumber_e_171();
		System.out.println(o.titleToNumber("AA"));
	}
	
}

