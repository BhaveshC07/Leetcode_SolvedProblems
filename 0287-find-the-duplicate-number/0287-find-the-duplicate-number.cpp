

class Solution {
public:
    int findDuplicate(std::vector<int>& nums) {
        int n = nums.size();
        std::vector<int> arr(n + 1, 0);
        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] > 1) {
                return i;
            }
        }
        return -1;
    }
};
