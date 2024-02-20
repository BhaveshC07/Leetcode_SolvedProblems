class Solution {
    public int kthFactor(int n, int k) {
        int[] arr=new int[1000];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[count]=i;
                count++;
            }
        }
        if(arr[k-1]>0){
            return arr[k-1];
        }else{
            return -1;
        }
        
    }
}