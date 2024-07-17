class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int n=nums.size();
        unordered_map<int,int>mpp;
        mpp[0]=1;
        int prefixSum=0,ans=0;
        for(int i=0;i<n;i++){
            prefixSum=(prefixSum+nums[i]%k+k)%k;
            ans+=mpp[prefixSum];
            mpp[prefixSum]++;
            
        }
        return ans;
        
    }
};