class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int i=0;
        int j=1;
        int arr[]=new int[2];
        while(i<n-1){
            sum=nums[i]+nums[j];
            if(target==sum){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
            j++;
            if(j==n){
                i++;
                j=i+1;
            }
        }
        return arr;
    }
}