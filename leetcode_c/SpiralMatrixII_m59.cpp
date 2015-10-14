class Solution {
public:
//next time try direction variable
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> ans(n, vector<int>(n));
        // what need to record?
        int i=1; //number filled
        int j=0; //which layer
        while (i<=n*n) {
            int k=j; // index
            while (k<n-j) {
                ans[j][k++]=i++;
            }
            k=j+1;
            while (k<n-j) {
                ans[k++][n-j-1]=i++;
            }
            k=n-j-2;
            while (k>=j) {
                ans[n-j-1][k--]=i++;
            }
            k=n-j-2;
            while (k>j) {
                ans[k--][j]=i++;
            }
            j++;
        }
        return ans;
    }
};