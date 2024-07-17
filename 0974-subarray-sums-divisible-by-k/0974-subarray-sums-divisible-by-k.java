class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0,prefsum=0,n=nums.length;
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefsum=(prefsum+nums[i]%k+k)%k;
             if (map.containsKey(prefsum)) {
                ans += map.get(prefsum);
                map.put(prefsum, map.get(prefsum) + 1);
            } else {
                map.put(prefsum, 1);
            }
        }
        return ans;
    }
}