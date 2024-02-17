class Solution {
    private static int finddigit(int x){
        int a=0;
        while(x!=0){
        x=x/10;
        a++;
        }
        return a-1;
    }
    public boolean isPalindrome(int x) {
        if(x==2147483647){
            return false;
        }
        int z=x;
        if(x<0){
        return false;
        }
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum += rem * Math.pow(10, finddigit(x));
            x=x/10;

        }
        if(sum==z){
            return true;
        }
        return false;
    }

}
