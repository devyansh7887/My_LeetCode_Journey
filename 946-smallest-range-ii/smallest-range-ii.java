class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int min, max;
        int diff = nums[n-1] - nums[0];
        for(int i = 1; i<n; i++){
            // if(nums[i] - k < 0) continue;
            min = Math.min(nums[0] + k, nums[i] - k);
            max = Math.max(nums[n-1] - k, nums[i-1] + k);
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}