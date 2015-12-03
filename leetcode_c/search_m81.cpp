class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int left=0, right = nums.size()-1;
        int mid;
        while(left<right) {
            mid=left+(right-left)/2;
            if (nums[mid]==target) 
                return true;
            if (nums[left]<nums[mid]) {//left half is sorted
                if (nums[left]<=target && target<nums[mid])
                    right=mid-1;
                else left=mid+1;
            }
            else if (nums[left]>nums[mid]) {
                if (nums[mid]<target && target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
            else left++;
        }
        return nums[left]==target;
    }
};