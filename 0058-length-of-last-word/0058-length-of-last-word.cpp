class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.length();
        int a = 0;
        int b=0;
        while(s[n-1] == ' '){
            n = n-1;
            s.resize(n);
        }
        for(int i=n-1; i>=0; i--){
            if(s[i] != ' '){
            a++;
            }

            else
            break;
        }
        return a;
    }
};