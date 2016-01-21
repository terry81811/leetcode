package linkedIn;

public class AddingFractions {
    static String[] fractionSum(String[] str) {
    	
    	String[] result = new String[str.length];

    	for(int i = 0; i < str.length; i++) {
    		String[] fractions = str[i].split("\\+|/");
    		
    		int X = Integer.valueOf(fractions[0]);
    		int Y = Integer.valueOf(fractions[1]);
    		int U = Integer.valueOf(fractions[2]);
    		int V = Integer.valueOf(fractions[3]);
    		
    		int numerator = X * V + Y * U;
    		int denominator = Y * V;
    		
    		//find gcd
    		int gcd = gcd(numerator,denominator);   
    		numerator = numerator / gcd;
    		denominator = denominator / gcd;
    		result[i] = numerator+"/"+denominator;
    		System.out.println(result[i]);
    	}
		return result;
    }
    
    static int gcd(int a, int b) {
    	if(b == 0) return a;
    	return gcd(b , a % b);
    }
    
    
    public static void main(String[] args) {
    	String[] s = new String[1];
    	s[0] = "258/840+854/686";
    	fractionSum(s);
    }
    
}
