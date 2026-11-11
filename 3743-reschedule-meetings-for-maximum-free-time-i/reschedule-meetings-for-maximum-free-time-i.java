
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {

        int n = startTime.length;

        int[] gaps = new int[n + 1];

        // Calculate gaps
        gaps[0] = startTime[0];

        for (int i = 1; i < n; i++) {
            gaps[i] = startTime[i] - endTime[i - 1];
        }

        gaps[n] = eventTime - endTime[n - 1];

        // Sliding window of size k + 1
        int windowSize = k + 1;

        int sum = 0;

        for (int i = 0; i < windowSize; i++) {
            sum += gaps[i];
        }

        int ans = sum;

        // Slide the window
        for (int i = windowSize; i <= n; i++) {

            sum += gaps[i];
            sum -= gaps[i - windowSize];

            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
