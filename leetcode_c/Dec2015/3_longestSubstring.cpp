class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> hashmap(256,-1);
        int start=0, longest=0;
        for (int i=0; i<s.size(); i++) {
            start=max(hashmap[s[i]]+1,start);
            hashmap[s[i]]=i;
            longest=max(longest,i-start+1);
        }
        return longest;
        // int count=0 , start =0 , max=0;
    
        // unordered_map<char,int> record;
        // for (int i=0; i<s.size(); i++ ) {
        //     if (record.find(s[i])!=record.end()) {
        //         if (record[s[i]] >= start) {
        //             if (count > max)
        //                 max=count;
        //             count = count -(record[s[i]]-start );
        //             start = record[s[i]]+1;
        //         }
        //         else {
        //             count++;
        //         }
        //     }
        //     else {
        //         count++;
        //     }
        //     record[s[i]]=i;
        // }
        
        // return (count>max)? count : max;
    }
};