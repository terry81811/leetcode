class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int  ones =0, twos=0, threes;
        for (int i=0; i<nums.size(); i++) {
            twos = twos|(ones&nums[i]); // save number that occur twice
            ones = ones^nums[i]; // XOR number,even occur->eliminate
            threes = twos&ones;
            ones = ones&~threes;
            twos = twos&~threes;
            
        }
        return ones;
    }
};