class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            int diff=prices[i+1]-prices[i];
            if(diff<0){
                diff=0;
            }
            arr[i]=diff;
        }
        int price=0;
        for(int i=0;i<n;i++){
            price+=arr[i];
        }
        return price;
    }
}