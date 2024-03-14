class Solution {
    public int trap(int[] height) {
        return trap_rain(height);
    }
     public static int trap_rain(int num[]){
        int LM[]=new int[num.length];
        int RM[]=new int[num.length];
        LM[0]=num[0];
        for (int i = 1; i < num.length; i++) {
            LM[i]=Math.max(num[i],LM[i-1]);
            //System.out.println(i+" "+LM [i]);
        }
        RM[num.length-1]=num[num.length-1];
        for (int i = num.length-2; i >= 0; i--) {
            RM[i]=Math.max(num[i],RM[i+1] );
            //System.out.println(i+" "+RM[i]);
        }
        int trappwater =0;
        for (int i = 0; i < num.length ; i++) {
            int waterlvl=Math.min(LM[i],RM[i]);
            trappwater+=waterlvl-num[i];
        }
        return trappwater;
    }
}