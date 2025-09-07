class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, len = 0;
        HashSet<Character> window = new HashSet<>();
        while(right < n){
            char c = s.charAt(right);
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}