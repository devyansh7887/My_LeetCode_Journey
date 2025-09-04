import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        long sum = 0L;           // window sum in long
        int ans = 0;
        long kk = k;             // compare against long

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // compute required increments in long
            while ((long) nums[right] * (right - left + 1L) - sum > kk) {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
