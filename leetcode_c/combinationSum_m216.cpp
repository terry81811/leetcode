class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> result;
        vector<int> sol;
        combination(result,sol,k,n);
        return result;
    }
    void combination(vector<vector<int>> &result, vector<int> &sol, int k, int sum) {
        if (sol.size()==k && sum==0) {
            result.push_back(sol);
            return;
        }
        for (int i= sol.empty()? 1:sol.back()+1; i<10; i++) {
            if (sum-i<0)
                return;
            sol.push_back(i);
            combination(result,sol,k,sum-i);
            sol.pop_back();
        }
    }
};