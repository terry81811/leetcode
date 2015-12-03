package leetcode;

public class E_168_ExcelSheetColumnTitle {
	
    public String convertToTitle(int n) {
        String s = "";
        while(n!=0) {
        	int remainder = n%26;
        	if(remainder == 0) {
        	    n = n -26;
        	}
        	char c = (char) (remainder == 0 ? 'Z' : 'A'+remainder-1);
        	s = c+s;
        	n = n/26;
        }
        return s;
    }

       	public String convertToTitle2(int n) {	//better handling n%26 == 0
            StringBuilder sb = new StringBuilder();
            while(n--!=0){
                sb.append((char)(n%26+'A'));
                n/=26;
            }
            return sb.length()==0?"A":sb.reverse().toString();
        }
    
	public static void main(String args[]) {
		char c = 'B'-1;
		System.out.println(c);
	}
}