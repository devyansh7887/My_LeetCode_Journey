class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }

        int max = -1;
        for (int num : nums) {
            if (num > 0 && values.contains(-num)) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
}