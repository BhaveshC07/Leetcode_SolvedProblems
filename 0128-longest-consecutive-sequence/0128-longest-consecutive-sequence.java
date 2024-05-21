class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0||n==1){
            return n;
        }
        int count=0,diff=0;
        int max=0;
        for(int i=0;i<n-1;i++){
            diff=nums[i+1]-nums[i];
            if(diff==1){
                count+=1;
                max=Math.max(max,count);
            }
            else if(diff ==0 ){
                continue;
            }else{
                count=0;
            }
        }
        return max+1;
    }
}