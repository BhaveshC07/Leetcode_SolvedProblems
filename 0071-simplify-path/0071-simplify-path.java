class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String p[]=path.split("/");
        String sb="";
        for(int i=0;i<p.length;i++){
            if(p[i].equals("") || p[i].equals(".")){
                continue;
            }else if(p[i].equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(p[i]);
            }
        }
        if(s.isEmpty()){
        return "/";
    }
                     
    while(!s.isEmpty()){
        sb = "/" + s.pop() + sb;
    }
    return sb;
    }
    
}