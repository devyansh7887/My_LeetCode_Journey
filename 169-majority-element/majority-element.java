class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; //initialised count
        int major = 0; //intialised a tracker to track majority element.
        for(int i = 0;i<nums.length;i++){//for loop to iterate the through the loop.
            if(nums[i] == nums[major]){
                count++;
            }else{
                count--;
            }
            //as soon as count goes less than 0, we switch the tracker as that elemnt is now the majority element
            if(count<0){
                major = i;
                count++;
            }
        }
        return nums[major];
    }
}