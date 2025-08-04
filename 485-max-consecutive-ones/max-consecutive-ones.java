class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int c = 0;
        // Iterate through the array
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                c++;
            }else{
                count = Math.max(c,count);
                c = 0;
            }
        }
        count= Math.max(count, c);
        return count;
    }
}
//Initial error: Line number 10
//Should keep the max of previous and current segment, because your current approach will lose the maximum if it occurs before the last 0