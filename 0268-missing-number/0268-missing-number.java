class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==1){
            return 0;
        }
        if(nums.length==1){
            return nums[0]+1;
        }
        
        int count=nums[0];
        for(int i=nums[0];i<nums.length+nums[0];i++){
            if(nums[i]!=count){
                return count;
            }
            count++;
        }
        return nums[nums.length-1]+1;
    }
}