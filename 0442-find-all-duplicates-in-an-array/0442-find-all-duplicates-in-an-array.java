class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i++]);
            }
        }
        return list;
    }
}