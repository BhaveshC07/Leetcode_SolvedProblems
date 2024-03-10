class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int arr[]=new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=1;i<n;i++){
            sum1+=nums[i-1];
            arr1[i]=sum1;
        }
        for(int i=n-2;i>=0;i--){
            sum2+=nums[i+1];
            arr2[i]=sum2;
        }
        for(int i=0;i<n;i++){
            arr[i]=Math.max(arr1[i],arr2[i])-Math.min(arr1[i],arr2[i]);
        }
        return arr;
    }
}