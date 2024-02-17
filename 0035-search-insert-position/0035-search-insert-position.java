class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s=0;
        int e=n-1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                s = mid + 1;
            }

            else {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }

        return mid;
    }
}