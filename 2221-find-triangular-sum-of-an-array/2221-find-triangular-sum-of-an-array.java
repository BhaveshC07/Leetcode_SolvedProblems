class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int m=n;
        while(m>1){
            for(int i=0;i<m-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
                //System.out.print(nums[i]+" ");
            }
            //System.out.println();
            m=m-1;
        }
        return nums[0];
    }
}