class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zero =0, two = nums.size()-1;
        for (int i=0; i<=two; i++) {
            // why first check 2?
            // <i sorted (either 1 or 0)
            while(nums[i]==2 && i<two) {
                swap(nums[i],nums[two]);
                two--;
            }
            while (nums[i]==0 && i>zero) {
                swap(nums[i],nums[zero]);
                zero++;
            }
            
            
        }
    }
};