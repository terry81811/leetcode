class Solution {
public:
    int countPrimes(int n) {
        bool isPrime[n];
        for (int i=2; i<n; i++) // why 2? check(sqrt n) and less than n, no need n
            isPrime[i] = true;
        
        for (int i=2; i*i<n; i++) {
            if (isPrime[i] == true) {
                for (int j=i*i; j<n; j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        
        int count=0;
        for (int i=2; i<n; i++) {
            if (isPrime[i]==true)
                count++;
        }
        return count;
    }
};