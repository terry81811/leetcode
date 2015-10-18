class Solution {
public:
    // void combine(vector<string>& vec, char str) {
    //     int s=vec.size();
    //     for (int i=0; i<s; i++) {
    //         for (int j=0; j<2; j++) {
    //             vec.push_back(vec[i]+(char)('a'+(str-'0'-2)*3+j));
    //         }
    //         vec[i]+=(char)('a'+(str-'0'-2)*3+2);
    //     }
    
    // }
    vector<string> letterCombinations(string digits) {
        // int s=digits.size();
        // vector<string> ans;
        // for (int i=0; i<3; i++)
        //     ans.push_back((char)('a'+(digits[0]-'0'-2)*3+i));
        // for (int i=1; i<s; i++) {
        //     combine(ans,digits[i]);
        // }
        // return ans;
        vector<string> mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        vector<string> ans;
        if (digits.size()==0) return ans;
        ans.push_back("");
        for (int i=0; i<digits.size(); i++) {
            int s=ans.size();
            string str=mapping[digits[i]-'0'];
            for (int j=0; j<s; j++) {
                for (int k=1; k<str.size(); k++)
                    ans.push_back(ans[j]+str[k]);
                ans[j]+=str[0];
            }
        }
        return ans;
    }
    
};