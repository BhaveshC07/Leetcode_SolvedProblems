class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}