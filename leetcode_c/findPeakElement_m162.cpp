class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        // O(logn) -> D&C? tree?
        // find max?
        return findLocal(nums,0,nums.size()-1);
    }
    int findLocal(vector<int>& nums, int leftidx, int rightidx) {
        if (leftidx==rightidx)
            return leftidx;
        int mid=(leftidx+rightidx)/2;
        if (nums[mid]>nums[mid+1])
            return findLocal(nums,leftidx,mid);
        else
            return findLocal(nums,mid+1,rightidx);
    }
};