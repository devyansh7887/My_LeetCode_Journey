class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> window = new HashSet<>();
        int longest = 0;
        int i = 0;
        int j = 0;

        while (j < n) {
            char d = s.charAt(j);

            while (window.contains(d)) {
                window.remove(s.charAt(i));
                i++;
            }

            window.add(d);
            j++;
            longest = Math.max(longest, window.size());
        }
        return longest;
    }
}