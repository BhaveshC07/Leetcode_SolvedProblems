class Solution {
    public int lengthOfLastWord(String s) {
        int a=0;
        int n=s.length()-1;
        while(s.charAt(n)==' '){
            n--;
        }
        for(int i=n; i>=0; i--){
            if(s.charAt(i) != ' '){
            a++;
            }
            else
            break;
        }
        return a;
    }
}