class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> vec(1,0);
        for (int i=0; i<n; i++) {
            int s=vec.size();
            int k=1<<i;
            for (int j=s-1; j>=0; j--) {
                vec.push_back(k|vec[j]);
            }
        }
        return vec;
    }
};