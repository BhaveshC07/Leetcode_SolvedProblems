class Solution {
    public int pivotInteger(int n) {
        if(n==1)return 1;
        int total_sum=(n*(n+1))/2;
        for(int i=2;i<n;i++){
            int ts=(i*(i+1))/2;
            if(ts==total_sum-ts+i){
                return i;
            }
        }
        return -1;
    }
}