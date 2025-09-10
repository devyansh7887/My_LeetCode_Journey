class Solution {
    public String minWindow(String s, String t) { 
        int m = s.length(); 
        int n = t.length(); 
        if(n > m) return ""; 
        
        // Count frequency of charachters in t
        HashMap<Character, Integer> map_t = new HashMap<>(); 
        for(char c : t.toCharArray()){
            map_t.put(c, map_t.getOrDefault(c, 0) + 1); 
        }
        int required = map_t.size(); // Number of unique charachters we need to match
        
        // Window variables 
        int left = 0, right = 0; 
        int formed = 0; // number of characters that satisfy frequency condition 
        
        Map<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {Integer.MAX_VALUE, 0, 0}; // {Window size, left, right}

        // Expand the window with the right pointer
        while(right < m){
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (map_t.containsKey(c) && windowCounts.get(c).intValue() == map_t.get(c).intValue()) {
                formed++;
            }
            while(left <= right && formed == required){
                if(right - left + 1 < ans[0]){
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }
                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (map_t.containsKey(leftChar) && windowCounts.get(leftChar) < map_t.get(leftChar)) {
                    formed--;
                }
                left++; 
            }
            right++;
        }
        return ans[0] == Integer.MAX_VALUE ? "" : s.substring(ans[1], ans[2] + 1);
    }
}