class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        } 
        // all uniques elements are in set now
        // now check for start of the sequence
        int longest = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int current = i;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}