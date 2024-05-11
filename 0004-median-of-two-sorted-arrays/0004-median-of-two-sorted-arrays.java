class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        double[] arr=new double[n];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[k++]=(double)nums1[i];   
        }
        for(int i=0;i<nums2.length;i++){
            arr[k++]=(double)nums2[i];   
        }
        
        Arrays.sort(arr);
        
        if(k%2==0){
            return (arr[k/2]+arr[(k/2)-1])/2.0;
        }else{
            return arr[k/2];
        }
    }
}