class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum_arr = 0;
        for(int i = 0; i<n; i++){
            sum_arr += nums[i];
        }
        int ls = 0;
        for(int i = 0; i<n-1; i++){
            sum_arr -= nums[i];
            ls += nums[i];
            if(isEven(sum_arr - ls)){
                count++;
            }
        }
        return count;
    }
    public Boolean isEven(int num){
        if(num%2 == 0) return true;
        return false;
    }
}