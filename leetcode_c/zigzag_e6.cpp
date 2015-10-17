class Solution {
public:
    string convert(string s, int numRows) {
        // the topmost segment (numRows-1)*2
        if (numRows==1) return s;
        int most = (numRows-1)*2;
        
        string str;
        for (int i=0; i<numRows; i++) {
            int flag = 0;
            for (int j=i; j<s.size(); ) {
                str += s[j];
                if (i==0) flag=1;
                else if (i==numRows-1) flag=0;
                else flag = flag ? 0 : 1 ;
                j += flag ? (most-2*i) : 2*i ;
            }
            
        }
        return str;
    }
};