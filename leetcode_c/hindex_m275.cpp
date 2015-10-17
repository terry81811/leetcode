class Solution {
public:
    int hIndex(vector<int>& citations) {
        if (citations.empty()) return 0;
        // if (citations)
        int h=0;
        int n=citations.size();
        for (int i=0; i<n; i++) {
            if (citations[i]>=n-i) {
                h=n-i;
                break;
            }
        }
        return h;
    }
};