class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            int val = Math.abs(nums[i]);
            if(nums[val] < 0) ans = Math.abs(nums[i]);
            nums[val] = -nums[val];
        }
        return ans;
    }
}