class Solution {
public:
    bool isPalindrome(string s) {
        if (s.size()==0) return true;
        int front=0, back=s.size()-1;
        while(front<=back) {
            if (!isalnum(s[front]))
                front++;
            else if (!isalnum(s[back]))
                back--;
            else if (tolower(s[front]) != tolower(s[back]))
                return false;
            else {
                front++;
                back--;
            }
        }
        return true;
        
        
    }
};