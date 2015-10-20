class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> m;
        for (int i=0; i<strs.size(); i++ ) {
            string str=strs[i];
            sort(str.begin(),str.end());
            m[str].push_back(strs[i]);
        }
        vector<vector<string>> ans;
        map<string,vector<string>>::iterator it=m.begin();
        for ( ; it!=m.end(); it++) {
            vector<string> temp = it->second;
            sort(temp.begin(),temp.end());
            ans.push_back(temp);
        }
        return ans;
    }
};