class Solution {
    public int maxArea(int[] height) {
        // int n=height.length;
        // int[] left=new int[n];
        // int[] right=new int[n];
        // left[0]=height[0];
        // right[n-1]=height[n-1];
        // for(int i=1;i<n;i++){
        //     left[i]=Math.max(height[i],left[i-1]);
        // }
        // for(int i=n-2;i>=0;i--){
        //     right[i]=Math.max(height[i],right[i+1]);
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(left[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print(right[i]+" ");
        // }
        // int maxArea=0;
        // for(int i=0;i<n;i++){
        //     int max=Math.min(left[i],right[i]);
        //     maxArea+=max-height[i];
        // }
        
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while (left<right){
            int width=right-left;
            int curr =width*Math.min(height[left],height[right]);;
            maxArea = Math.max(maxArea,curr);
            if (height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}