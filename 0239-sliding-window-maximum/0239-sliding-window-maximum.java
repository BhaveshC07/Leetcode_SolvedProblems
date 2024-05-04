
class Solution {
    
    static class Pair implements Comparable<Pair>{
        int idx;
        int val;
        public Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }    
        public int compareTo(Pair s2){
            return s2.val-this.val;
        }
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        int n=nums.length;
        int[] res=new int[n-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new Pair(i,nums[i]));
        }
        
        res[0]=pq.peek().val;
        
        for(int i=k;i<n;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(i,nums[i]));
            res[i-k+1]=pq.peek().val;
        }
        return res;
    }
}