class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n-1] = 1;
        int lp = 1, rp = 1;
        for(int i = 1; i<n; i++){
            left[i] = lp * nums[i-1];
            lp = left[i];
        }
        for(int i = n-2; i>=0; i--){
            right[i] = rp * nums[i+1];
            rp = right[i];
        }
        for(int i = 0; i<n; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}