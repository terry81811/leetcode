class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        int m=board.size(), n=board[0].size();
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++) {
                int count =0;
                for (int ii=max(i-1,0); ii<min(i+2,m); ii++)
                    for (int jj=max(j-1,0); jj<min(j+2,n); jj++) {
                        count += board[ii][jj] & 1;
                    }
                if ((board[i][j] & count == 4 )|| count ==3)
                    board[i][j] += 2;
            }
        
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                board[i][j] >>= 1;
    }
};