class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!s1.isEmpty() && s1.peek()=='(' && ch==')'){
                s1.pop();
                s2.pop();
                if(s2.isEmpty()){
                    count=i+1;
                }else{
                    count=Math.max(count,i-s2.peek());
                    
                }
            }
            else{
            s1.push(ch);
            s2.push(i);
        }
        }
        return count;
    }
}