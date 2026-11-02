class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0; 
        while(i<n){
            int value = nums[i];
            if(value <= 0 || value > n){
                i++;
                continue;
            }
            int t = value - 1;
            if(nums[t] != value){
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j<n; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}