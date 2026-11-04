class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        List<Integer> res = new ArrayList<>();
        if (n1 < n2) return res;

        int[] pCnt = new int[26];
        int[] wCnt = new int[26];

        for (int i = 0; i < n2; i++) {
            pCnt[p.charAt(i) - 'a']++;
            wCnt[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCnt, wCnt)) res.add(0);

        for (int i = n2; i < n1; i++) {
            wCnt[s.charAt(i) - 'a']++;
            wCnt[s.charAt(i - n2) - 'a']--;
            if (Arrays.equals(pCnt, wCnt)) res.add(i - n2 + 1);
        }
        return res;
    }
}