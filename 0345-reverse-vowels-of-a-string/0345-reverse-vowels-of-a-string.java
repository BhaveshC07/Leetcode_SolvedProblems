class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            if (!vowel(arr[left])) {
                left++;
                continue;
            }
            if (!vowel(arr[right])) {
                right--;
                continue;
            }
            //System.out.println(arr[left]+" "+arr[right]);
            char ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static boolean vowel(char ch){
        if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U'){
            return true;
        }else{
            return false;
        }
    }
}