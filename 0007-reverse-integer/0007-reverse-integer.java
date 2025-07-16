class Solution {
    public int reverse(int x) {
        int i = 0;
        while (x != 0) {
            int digit = x % 10;
            
            // Check for overflow BEFORE it happens
            if (i > Integer.MAX_VALUE / 10 || (i == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (i < Integer.MIN_VALUE / 10 || (i == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            i = i * 10 + digit;
            x /= 10;
        }
        return i;
    }
}
