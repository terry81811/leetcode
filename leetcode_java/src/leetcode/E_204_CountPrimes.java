package leetcode;

import java.util.Arrays;

public class E_204_CountPrimes {
    public int countPrimes(int n) {
        if(n<3) return 0;
        
        boolean[] prime = new boolean[n+1];	//note that I use n+1 to represent 0 to N
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i=4; i<=n; i++) {
            if(i%2 ==0) prime[i] = false;
        }

        for(int j=3; j<=Math.sqrt(n); j++) {
            for(int num = j*j; num<n; num+=j*2) {
                prime[num] = false;
            }
        }
        
        int count = 0;
        for(int i=0; i<n; i++) {	//but the question want LESS THAN, so I did not reach N+1
            if(prime[i] == true) count++;
        }

        return count;
    }

	public static void main(String args[]) {
		E_204_CountPrimes o = new E_204_CountPrimes();
		System.out.println(o.countPrimes(9));
	}
	
}
