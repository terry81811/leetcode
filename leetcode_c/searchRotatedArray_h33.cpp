class Solution {
public:
    int search(vector<int>& nums, int target) {
        //find the rotation step first
        int n=nums.size();
        if (n==1) {
            if (target==nums[0]) return 0;
            else return -1;
        }
        int low=0; 
        int high=n-1;
        while (low<high ) {
            int mid = low+(high-low)/2;
            if (nums[mid]>nums[high]) low=mid+1;
            else high=mid;
        }
        // low==high==smallest == rotation step
        int rot=low;
        low=0;
        high = n-1;
        while (low<=high) {
            int mid = low+(high-low)/2;
            int realmid = (mid+rot)%n;
            if (nums[realmid]==target) return realmid;
            else if (nums[realmid]>target) high=mid-1;
            else low =mid+1;
        }
       return -1;
        
        
    }
};