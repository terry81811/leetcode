class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> dq; // only store possible index ( within window, max)
        vector<int> res;
        for (int i=0; i<nums.size(); i++) {
            if (!dq.empty() && dq.front()<=i-k) 
                dq.pop_front(); // out of window size
            while (!dq.empty() && nums[i] > nums[dq.back()])
                dq.pop_back();
            dq.push_back(i);
            if (i>=k-1)
                res.push_back(nums[dq.front()]);
        }
        return res;
    }
};


