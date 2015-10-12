class Solution {
public:
    int maxArea(vector<int>& height) {
        // from 2 side
        int maxArea=0;
        int left=0, right=height.size()-1;
        while(left<right) {
            maxArea=max(maxArea,(right-left)*min(height[left],height[right]));
            if (height[left]<height[right]) {
                left++;
            }
            else
                right--;
            //consider heigh[left]==height[right]? 
        }
        return maxArea;
        
        
    }
};