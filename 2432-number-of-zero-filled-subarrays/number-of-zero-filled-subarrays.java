class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long count = 0, curr = 0;
        for(int num: nums){
            if(num == 0){
                curr++;
                count += curr;
            }else{
                curr = 0;
            }
        }
        return count;
    }
}