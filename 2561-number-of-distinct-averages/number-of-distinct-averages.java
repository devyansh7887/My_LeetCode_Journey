class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0;
        int j = n-1;
        while(i<j){
            int avg = (nums[i] + nums[j]);
            set.add(avg);
            i++;
            j--; 
        }
        return set.size();
    }
}