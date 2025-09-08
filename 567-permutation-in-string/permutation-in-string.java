class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freqS1 = new int[26];
        int[] freqWindow = new int[26];

        // Build frequency of s1
        for (char c : s1.toCharArray()) {
            freqS1[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            // Add current char into window
            freqWindow[s2.charAt(right) - 'a']++;

            // Shrink if window size > s1.length()
            if (right - left + 1 > s1.length()) {
                freqWindow[s2.charAt(left) - 'a']--;
                left++;
            }

            // ✅ FIX: Only compare when window size == s1.length()
            if (right - left + 1 == s1.length()) {
                if (matches(freqS1, freqWindow)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
