class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2]; // made a new array that needs to be returned
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; // return as soon as found
                }
            }
        }
        return arr; // will return default if not found (not recommended)
    }
}
// okokok
// Better approach : Two pointer method