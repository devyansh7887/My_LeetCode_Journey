class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // Change both strings into char arrays
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        // Sort both arrays
        Arrays.sort(chars);
        Arrays.sort(chart);
        // Back to strings
        String ss = new String(chars);
        String tt = new String(chart);
        // Compare
        if(ss.equals(tt)) return true;
        else return false;
    }
}