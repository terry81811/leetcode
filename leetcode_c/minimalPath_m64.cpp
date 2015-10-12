class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        vector<vector<int>> sum(m,vector<int>(n,0));
        
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++) {
                if (i==0 && j==0)
                    sum[i][j] = grid[i][j];
                else if (i==0)
                    sum[i][j] = sum[0][j-1] + grid[i][j];
                else if (j==0)
                    sum[i][j] = sum[i-1][0] + grid[i][j];
                else sum[i][j] = min(sum[i-1][j],sum[i][j-1])+grid[i][j];
            }
            
        return sum[m-1][n-1];
    }
};