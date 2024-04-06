class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                return true;
            }
        }
        return false;
    }
}