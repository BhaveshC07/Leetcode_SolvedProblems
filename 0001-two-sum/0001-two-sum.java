class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int[] arr=new int[2];
        int i=0;
        while(i<n-1){
            int j=i+1;
            while(j<n){
                sum=nums[j]+nums[i];
                if(sum==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
                }
                j++;
            }
            i++;
        }
        return arr;
    }
}