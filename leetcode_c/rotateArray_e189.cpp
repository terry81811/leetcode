class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int s = nums.size();
        k%=s;
        if (k==0 || s==0)
            return;
        reverse(nums.begin(),nums.end());
        reverse(nums.begin(),nums.begin()+k);
        reverse(nums.begin()+k,nums.end());
    }
};