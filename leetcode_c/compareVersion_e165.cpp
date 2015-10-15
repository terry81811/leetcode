class Solution {
public:
    vector<int> split(string str, char d) {
        stringstream ss(str);
        vector<int> splitvec;
        string item;
        while (getline(ss,item,d)) {
            splitvec.push_back(stoi(item));
        }
        return splitvec;
        
    }
    int compareVersion(string version1, string version2) {
        vector<int> v1=split(version1,'.');
        vector<int> v2=split(version2,'.');

        for (int i=0; i<max(v1.size(),v2.size()); i++) {
            int i1 = (i<v1.size())? v1[i]: 0;
            int i2 = (i<v2.size())? v2[i]: 0;
            if (i1>i2)
                return 1;
            else if (i1<i2)
                return -1;
        }
        return 0;
        
    }
};