class Solution {
    public int longestConsecutive(int[] nums) {
        //OPTIMAL SOLUTION
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longest = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int length = 1;
                int current = i;
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