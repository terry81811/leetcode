class Solution {
public:
    int reverse(int x) {
        if (x==0) return x;
        bool flag= (x<0);
        long result=0;
        x = abs(x);
        while(x) {
            result = result*10 + x%10;
            x /= 10;
        }
        result = (flag) ? -result : result;
        if (result > INT_MAX || result < INT_MIN)
            return 0;
        return result;
    }
};