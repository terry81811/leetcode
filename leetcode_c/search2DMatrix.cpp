class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        // int n=matrix[0].size();
        // for (int r=0; r<matrix.size(); r++ ) {
        //     if (target<matrix[r][0])
        //         return false;
        //     if (target>=matrix[r][0] && target<=matrix[r][n-1]) {
        //         for (int c=0; c<n; c++) {
        //             if (target==matrix[r][c])
        //                 return true;
        //             else if(target<matrix[r][c])
        //                 return false;
                    
        //         }
        //     }
        // }
        int m=matrix.size(), n=matrix[0].size();
        int left=0, right=m*n-1;
        while (left != right) {
            int mid = (left+right)/2;
            if (matrix[mid/n][mid%n]<target)
                left = mid+1;
            else right =mid;
        }
        return matrix[left/n][left%n]==target;
    }
};