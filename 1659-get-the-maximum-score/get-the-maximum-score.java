class Solution {
    private static final int MOD = 1000000007;

    public int maxSum(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0, result = 0;
        int m = nums1.length, n = nums2.length;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                sum2 += nums2[j++];
            } else {
                // common element reached
                long maxSum = Math.max(sum1, sum2);
                result = (result + maxSum + nums1[i]) % MOD;
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < m) sum1 += nums1[i++];
        while (j < n) sum2 += nums2[j++];

        long maxSum = Math.max(sum1, sum2);
        result = (result + maxSum) % MOD;

        return (int) result;
    }
}
