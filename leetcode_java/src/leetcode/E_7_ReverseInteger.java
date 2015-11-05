package leetcode;


// be careful about exceeding the limit of integer
public class E_7_ReverseInteger {
	private static final int MAXDIV10 = Integer.MAX_VALUE / 10;
	private static final int MINDIV10 = Integer.MIN_VALUE / 10;
	
	public int reverse(int x) {
		if(x<10 && x>-10) return x;
		
		int remainder = 0;
		int res = 0;
		while(x!=0) {
			if(res > MAXDIV10 || res < MINDIV10 ) return 0;
			
			remainder = x%10;
			res = res*10 + remainder;
			x = x/10;
		}

		return res;

	}
	
	public static void main(String[] args) {
		E_7_ReverseInteger o = new E_7_ReverseInteger();
		System.out.print(o.reverse(-20));
	}
}
