class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=nums[s.peek()];
            }
            
            s.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = nums[s.peek()];
            }

            s.push(i);
        }
        return arr;
    }
}