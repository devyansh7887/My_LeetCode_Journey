class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == nums[major]){
                count++;
            }else{
                count--;
            }
            if(count<0){
                major = i;
                count++;
            }
        }
        return nums[major];
    }
}