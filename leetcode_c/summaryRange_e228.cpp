class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int startidx = 0;
        vector<string> vec;
        if (nums.size()==0)
            return vec;
        for (int i=1; i<nums.size(); i++) {
            while (i<nums.size() &&nums[i] == nums[i-1]+1)
                i++;
        
            if (startidx == i-1) {
                vec.push_back(to_string(nums[startidx]));
                }
            else {
                vec.push_back(to_string(nums[startidx]) +"->" + to_string(nums[i-1]));
            }
            startidx = i;
        }
        if (startidx == nums.size()-1)
            vec.push_back(to_string(nums[startidx]));
        // else
        //     vec.push_back(to_string(nums[startidx]) +"->" + to_string(nums[nums.size()-1]));
        return vec;
    }
};