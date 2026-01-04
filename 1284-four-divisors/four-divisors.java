class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){ // Iterate through the entire array.
            int count = 2;
            int temp_sum = 1 + nums[i];
            for(int j = 2; j*j <= nums[i]; j++){ // check the number of divisors of the i(th) element
                if(nums[i]%j == 0 && j == nums[i]/j){
                    count++;
                    temp_sum += j;
                }else if(nums[i]%j == 0){
                    count = count + 2;
                    temp_sum += j;   
                    temp_sum += nums[i] / j;
                } 
            }
            if(count == 4) sum += temp_sum;

        }
        return sum;
    }
}