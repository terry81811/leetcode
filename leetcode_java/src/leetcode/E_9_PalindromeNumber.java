package leetcode;

public class E_9_PalindromeNumber {
    public boolean isPalindrome(int x) {
    	int res = x;
    	int reverse = 0;
    	while(res > 0) {
    		
    		reverse = reverse*10 + res%10;
    		res = res / 10;
    		System.out.println(reverse+" "+res);
    	}
    	return x == reverse;
        
    }
    
    public static void main(String[] args) {
    	E_9_PalindromeNumber o = new E_9_PalindromeNumber();
    	o.isPalindrome(1234);
    }
}
