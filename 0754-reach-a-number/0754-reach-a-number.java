class Solution {
    public int reachNumber(int target) {
        int temp=0;
        int ans=0;
        int diff=0;
        target=Math.abs(target);
        while(temp<target){
            ans++;
            temp+=ans;
        }
        if(temp==target){
            return ans;
        }
        
        diff=temp-target;
        if(diff%2==0){
            return ans;
        }
        
        return ans%2==0?ans+1:ans+2;
    }
}