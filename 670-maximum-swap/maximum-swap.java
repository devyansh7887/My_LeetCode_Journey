class Solution {
    public int maximumSwap(int num) {
        // Convert number to array of digits
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Record the last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[digits[i] - '0'] = i;
        }//

        // Traverse from left to right
        for (int i = 0; i < n; i++) {
            int current = digits[i] - '0';
            // Look for a bigger digit (from 9 down to current+1)
            for (int d = 9; d > current; d--) {
                if (last[d] > i) { // rightmost occurrence of a bigger digit is after i
                    // Swap
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;

                    // Return result after first swap
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        // No swap needed (already maximum)
        return num;
    }
}
