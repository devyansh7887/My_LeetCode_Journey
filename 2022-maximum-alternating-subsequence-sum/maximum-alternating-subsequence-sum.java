class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long even = 0, odd = 0;
        for(long num : nums){
            even = Math.max(even, odd + num);
            odd = Math.max(odd, even - num);
        }
        return even;
    }
}