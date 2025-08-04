class Solution {
    public int singleNumber(int[] nums) {
        // Integer r = null;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            } 
        }
        return -1;
    }
}
// Initial error : line no. 17
// Runtime Error
// 