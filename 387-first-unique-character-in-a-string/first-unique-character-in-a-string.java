class Solution {
    public int firstUniqChar(String s) {
        // OPTIMAL APPROACH : FREQUENY ARRAY
        int n = s.length();
        int[] freq = new int[256];
        for(int i = 0; i<n; i++){
            freq[s.charAt(i)]++;
        }
        int ans = -1;
        for(int i = 0; i<n; i++){
            if(freq[s.charAt(i)] == 1){ans = i; break;}
        }
        return ans;
    }
}