class Solution {
public:
    bool wordPattern(string pattern, string str) {
        
        map<char,int> patm;
        map<string,int> strm;
        
        istringstream ss(str);
        int n=pattern.size();
        int i=0;
        for (string word; ss >> word; i++) {
            if (i==n || patm[pattern[i]] != strm[word])
                return false;
            patm[pattern[i]] = strm[word] = i+1;
        }
        return i==n;
        
        // vector<string> strvec;
        // stringstream ss(str);
        // string tmp;
        // while(getline(ss,tmp)) {
        //     strvec.push_back(tmp);
        // }
        // map<string,string> mapping;
        // if (pattern.size() != strvec.size())
        //     return false;
        // for (int i=0; i<pattern.size(); i++) {
        //     tmp=pattern[i];
        //     map<string,string>::iterator it = mapping.find(tmp);
        //     if (it == mapping.end())
        //         mapping[tmp]=strvec[i];
        //     else {
        //         if (mapping[tmp]!=strvec[i])
        //             return false;
        //     }
        // }
        // return true;
    }
};