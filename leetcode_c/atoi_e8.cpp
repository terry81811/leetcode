class Solution {
public:
    int myAtoi(string str) {
        int ans=0;
        size_t start= str.find_first_not_of(' ');
        bool isNeg= (str[start]=='-');
        if (str[start]=='+' || str[start]=='-')
            start++;
        for (int i=start; i<str.size(); i++) {
            if (str[i] - '0' <= 9 && str[i]-'0' >= 0) {
                if (ans > INT_MAX/10 || (ans == INT_MAX/10 && str[i]-'0'>7))
                    return isNeg? INT_MIN : INT_MAX;            
                ans = ans*10+(str[i]-'0');
            }
            else break;
            
        }
        return isNeg? -ans: ans;
    }
};