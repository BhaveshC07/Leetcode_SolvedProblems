class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                return i;
            }
        }
        return -1;
    }
}