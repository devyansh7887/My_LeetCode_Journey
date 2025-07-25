class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    //if length of both strings are different, then they cant be anagrams.
    char[] a1 = s.toCharArray();
    char[] a2 = t.toCharArray();
    //converting both strings into arrays.
    Arrays.sort(a1);//worthy
    Arrays.sort(a2);//worthy
    //sorting both arrays.
    return Arrays.equals(a1, a2);
    }
}