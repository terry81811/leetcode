class Solution {
public:
    string getHint(string secret, string guess) {
        int sv[10]={0};
        int gv[10]={0};
        
        int a=0, b=0;
        for (int i=0; i<secret.size(); i++) {
            if (secret[i]==guess[i])
                a++;
            else {
                sv[secret[i]-'0']++;
                gv[guess[i]-'0']++;
            }
        }
        for (int i=0; i<10; i++) {
            b+= min(sv[i],gv[i]);
        }
        return to_string(a)+'A'+to_string(b)+'B';
    }
};