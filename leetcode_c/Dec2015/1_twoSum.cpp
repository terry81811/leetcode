class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans(2,0);
        map<int,int> remains; //<value,index>
        for (int i=0; i<nums.size(); i++) {
            if (remains.find(nums[i])!=remains.end()) {
                ans[0]=remains[nums[i]];
                ans[1]=i+1;
                return ans;
            }
            remains[target-nums[i]]=i+1;
        }
        return ans;
    }
};