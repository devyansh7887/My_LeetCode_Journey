class Solution {
    public boolean isSubsequence(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        int ps = 0;
        int pt = 0;
        int count = 0;
        if(ns > nt) return false;
        if(ns == 0) return true;
        while (pt < nt && ps < ns) { // <-- check ps < ns too!
            if (s.charAt(ps) == t.charAt(pt)) {
                ps++; // move in s
            }
            pt++; // always move in t
        }
        return ps == ns; 
    }
}