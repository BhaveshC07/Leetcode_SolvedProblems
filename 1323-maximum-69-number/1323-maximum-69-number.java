class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                return Integer.parseInt(sb.toString());
            }
        }
        return num;
    }
}
