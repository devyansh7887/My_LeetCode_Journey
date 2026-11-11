
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        // Min heap: projects sorted by required capital
        PriorityQueue<int[]> minCapital = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Max heap: available projects sorted by profit
        PriorityQueue<Integer> maxProfit = new PriorityQueue<>(
            (a, b) -> Integer.compare(b, a)
        );

        // Store {required capital, profit}
        for (int i = 0; i < profits.length; i++) {
            minCapital.offer(new int[]{capital[i], profits[i]});
        }

        // Select at most k projects
        for (int i = 0; i < k; i++) {

            // Add all affordable projects to max heap
            while (!minCapital.isEmpty() &&
                   minCapital.peek()[0] <= w) {

                maxProfit.offer(minCapital.poll()[1]);
            }

            // No project is affordable
            if (maxProfit.isEmpty()) {
                break;
            }

            // Choose the project with maximum profit
            w += maxProfit.poll();
        }

        return w;
    }
}
