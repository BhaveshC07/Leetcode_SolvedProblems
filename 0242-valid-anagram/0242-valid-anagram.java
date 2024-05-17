class Solution {
    public boolean isAnagram(String s, String t) {
        s=sort(s);
        t=sort(t);
        return s.equals(t);
    }
    public static String sort(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}