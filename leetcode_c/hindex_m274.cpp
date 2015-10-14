class Solution {
public:
    int hIndex(vector<int>& citations) {
        sort(citations.begin(),citations.end());
        int n= citations.size();
        if (n==0) return 0;
        int h;
        for(int i=0; i<n; i++) {
            if (citations[i]>=n-i) {
                h=n-i;
                break;
            }
        }
        return h;
    }
};