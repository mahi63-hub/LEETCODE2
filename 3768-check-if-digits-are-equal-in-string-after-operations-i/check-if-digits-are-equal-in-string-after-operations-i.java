class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i + 1 < s.length(); i++) {
                int d1 = s.charAt(i) - '0';
                int d2 = s.charAt(i + 1) - '0';
                sb.append((d1 + d2) % 10);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}

