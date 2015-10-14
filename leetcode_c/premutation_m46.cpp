class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        generatePermute(nums,ans,0);
        return ans;
    }
    void generatePermute(vector<int>& nums, vector<vector<int>>& ans, int begin) {
        if ( begin == nums.size()) {
            ans.push_back(nums);
            return;
        }
        for (int i=begin; i<nums.size(); i++) {
            swap(nums[begin],nums[i]);
            generatePermute(nums,ans,begin+1);
            swap(nums[begin],nums[i]);
        }
    }
};