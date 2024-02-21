class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        
        //next smallest right
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        
        
        //next smaller left
        s=new Stack<>();
        for(int i=0 ;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()] >=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        
        int area=0;
        for(int i=0;i<n;i++){
            int area1=heights[i]*(nsr[i]-nsl[i]-1);
            area=Math.max(area,area1);
        }
        return area;
    }
}