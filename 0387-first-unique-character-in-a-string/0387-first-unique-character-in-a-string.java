class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            
        }
        if(q.isEmpty()){
            return -1;
        }else{
            for(int i=0;i<s.length();i++){
                if(q.peek()==s.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }
}