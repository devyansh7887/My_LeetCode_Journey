class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int max = 0;
        for(int j = 0;j<nums.length-1;j++){
            if(nums[j]>max){
                max = nums[j];
            }
        }
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int missing = actual_sum - sum;
        return actual_sum - sum;
    }
}