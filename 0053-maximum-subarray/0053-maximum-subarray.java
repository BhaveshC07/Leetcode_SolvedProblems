class Solution {
    public int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        if(count==0){
            return max;
        }
        
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs<0){
                cs=0;
            }ms=Math.max(cs,ms);
        }
        return ms;
    }
}