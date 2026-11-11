
class Solution {
    public int halveArray(int[] nums) {

        PriorityQueue<Double> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        // Calculate sum and build max heap
        for (int num : nums) {
            sum += num;
            pq.offer((double) num);
        }

        double target = sum / 2.0;
        double reduced = 0;
        int operations = 0;

        while (reduced < target) {

            double largest = pq.poll();

            double half = largest / 2.0;

            reduced += half;

            pq.offer(half);

            operations++;
        }

        return operations;
    }
}
