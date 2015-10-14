class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>> result;
        vector<int> v;
        helper(result,v,k,1,n);
        return result;
    }
    
    void helper(vector<vector<int>> &result, vector<int> &v, int k, int start, int n) {
        if (v.size()==k) {
            result.push_back(v);
            return;
        }
        for (int i=start; i<=n; i++) {
            v.push_back(i);
            helper(result,v,k,i+1,n);
            v.pop_back();
        }
        
    }
};