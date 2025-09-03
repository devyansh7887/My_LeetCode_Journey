class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int pre = 1, suf = 1;
        int maxP = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            pre *= nums[i];
            suf *= nums[n-i-1];
            maxP = Math.max(maxP, Math.max(pre, suf));
        }
        return maxP;
    }
}