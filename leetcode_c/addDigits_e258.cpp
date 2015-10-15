class Solution {
public:
    int addEachDigit(int num) {
        int ans=0;
        while (num/10) {
            ans+=num%10;
            num/=10;
        }
        ans+=num%10;
        return ans;
    }
    int addDigits(int num) {
        int add=num;
        while (add/10) {
            add = addEachDigit(add);
        }
        return add;
    }
};