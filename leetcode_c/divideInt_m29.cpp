class Solution {
public:
    int divide(int dividend, int divisor) {
        if (divisor ==0 || (dividend==INT_MIN && divisor==-1))
            return INT_MAX;
        int neg = ((dividend<0) ^ (divisor<0)) ? 1 : 0;
        long long end=labs(dividend);
        long long sor=labs(divisor);
        int result=0;
        while(end>=sor) {
            long long temp = sor;
            int count=1;
            while (end>(temp<<1)) {
                temp = temp<<1;
                count = count <<1;
            }
            end -= temp;
            result+=count;
        }
        return neg ? -result:result;
    }
};