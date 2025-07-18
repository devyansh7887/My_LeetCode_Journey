class Solution {

    public static int returnmin(int[] nums) {
        int i = 0;
        for (int min = 1; min < nums.length; min++) {
            if (nums[min] < nums[i]) {
                i = min;
            }
        }
        return i;
    }

    public static int returnmax(int[] nums) {
        int j = 0;
        for (int max = 1; max < nums.length; max++) {
            if (nums[max] > nums[j]) {
                j = max;
            }
        }
        return j;
    }

    public int minimumDeletions(int[] nums) {
        int maximum = returnmax(nums);
        int minimum = returnmin(nums);
        int n = nums.length;

        // Case 1: Delete both from front
        int fromFront = Math.max(maximum, minimum) + 1;

        // Case 2: Delete both from end
        int fromEnd = n - Math.min(maximum, minimum);

        // Case 3: One from front, one from end
        int bothEnds = (Math.min(maximum, minimum) + 1) + (n - Math.max(maximum, minimum));

        return Math.min(fromFront, Math.min(fromEnd, bothEnds));
    }
}
