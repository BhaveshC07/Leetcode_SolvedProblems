class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] maps=new int[256];
        int[] mapt=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(maps[c1]!=0 && maps[c1]!=c2 || mapt[c2]!=0 && mapt[c2]!=c1){
                return false;
            }
            maps[c1]=c2;
            mapt[c2]=c1;
        }
        return true;
        
    }
}