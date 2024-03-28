class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (final char c : s.toCharArray()) {
        final int n = sb.length();
        if (n > 0 && sb.charAt(n - 1) == c)
            sb.deleteCharAt(n - 1);
        else
            sb.append(c);
        }   
        return sb.toString();
    }
}