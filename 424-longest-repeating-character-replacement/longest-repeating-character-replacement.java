class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26]; // frequency of charachters.
        int left = 0, maxfreq = 0, maxLen = 0;
        for(int right = 0; right<n; right++){
            // update the frequency of the current charachter
            freq[s.charAt(right) - 'A']++;
            // update maxfreq
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            // check window Validity
            while((right - left + 1) - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            // update the max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
// We don’t need to recalculate maxFreq after every shrink, because even if maxFreq is “outdated” (too high), the condition (windowSize - maxFreq) ≤ k will fail and force shrinking anyway.