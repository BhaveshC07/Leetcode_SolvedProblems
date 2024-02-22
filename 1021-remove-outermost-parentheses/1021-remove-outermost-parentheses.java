class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> s1=new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(s1.size()>=1){
                    sb.append(s.charAt(i));
                }
                s1.push(s.charAt(i));
            }else{
                if(s1.size()>1){
                    sb.append(s.charAt(i));
                }
                s1.pop();
            }
        }
        return sb.toString();
    }
}