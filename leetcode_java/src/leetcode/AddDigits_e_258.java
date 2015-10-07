package leetcode;

public class AddDigits_e_258 {
    public int addDigits(int num) {
        if(num < 10) {
        	return num;
        }else {
    		String s = num+"";
            return addDigits(this.explode(s));    
        }
    }
    
    public int explode(String s) {
    	int sum = 0;
    	for(int i=0; i<s.length(); i++) {
    		sum += Character.getNumericValue(s.charAt(i));
    	}
    	return sum;
    }
    
    //one-liner, mod 9 
    public int addDigits2(int num) {
    	return (num<10)?num:((num-10)%9)+1;
    }
    
	public static void main(String[] args) {
		AddDigits_e_258 o = new AddDigits_e_258();
		System.out.println(o.addDigits(258));
	}
}
