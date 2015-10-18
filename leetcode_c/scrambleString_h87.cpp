class Solution {
public:
    bool isScramble(string s1, string s2) {
       if (s1==s2) return true;
       int check[26] = {0};
       int s=s1.size();
       if (s1.size()!=s2.size()) return false;
       for (int i=0; i<s; i++) {
           check[s1[i]-'a']++;
           check[s2[i]-'a']--;
       }
       for (int i=0; i<26; i++)
           if (check[i]!=0) return false;
       
       for (int i=1; i<s; i++) {
           if (isScramble(s1.substr(0,i),s2.substr(0,i)) && isScramble(s1.substr(i),s2.substr(i)))
                return true;
           else if(isScramble(s1.substr(0,i),s2.substr(s-i)) && isScramble(s1.substr(i),s2.substr(0,s-i)))
                return true;
       }
       return false;
       
    }
};