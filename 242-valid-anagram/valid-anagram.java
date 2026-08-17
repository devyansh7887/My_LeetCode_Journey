class Solution {
    public boolean isAnagram(String s, String t) {
        // Approach#1 : Convert and Sort 
        if(s.length() != t.length()) return false;
        // // Change both strings into char arrays
        // char[] chars = s.toCharArray();
        // char[] chart = t.toCharArray();
        // // Sort both arrays
        // Arrays.sort(chars);
        // Arrays.sort(chart);
        // // Back to strings
        // String ss = new String(chars);
        // String tt = new String(chart);
        // // Compare
        // if(ss.equals(tt)) return true;
        // else return false;
        // TC : O(NlogN)
        // ACCEPTED

        // Approach#2 : FREQUENCY ARRAY
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}